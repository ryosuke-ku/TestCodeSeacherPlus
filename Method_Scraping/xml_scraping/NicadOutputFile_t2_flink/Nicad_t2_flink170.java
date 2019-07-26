// clone pairs:5926:82%
// 6300:flink/flink-runtime/src/main/java/org/apache/flink/runtime/blob/BlobClient.java

public class Nicad_t2_flink170
{
	BlobKey putBuffer(
			@Nullable JobID jobId, byte[] value, int offset, int len, BlobKey.BlobType blobType)
			throws IOException {

		if (this.socket.isClosed()) {
			throw new IllegalStateException("BLOB Client is not connected. " +
					"Client has been shut down or encountered an error before.");
		}
		checkNotNull(value);

		if (LOG.isDebugEnabled()) {
			LOG.debug("PUT BLOB buffer (" + len + " bytes) to " + socket.getLocalSocketAddress() + ".");
		}

		try (BlobOutputStream os = new BlobOutputStream(jobId, blobType, socket)) {
			os.write(value, offset, len);
			// Receive blob key and compare
			return os.finish();
		} catch (Throwable t) {
			BlobUtils.closeSilently(socket, LOG);
			throw new IOException("PUT operation failed: " + t.getMessage(), t);
		}
	}
}