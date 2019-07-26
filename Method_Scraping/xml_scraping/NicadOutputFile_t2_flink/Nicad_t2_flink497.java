// clone pairs:10275:100%
// 11316:flink/flink-core/src/main/java/org/apache/flink/core/fs/LimitedConnectionsFileSystem.java

public class Nicad_t2_flink497
{
		public void close() throws IOException {
			if (closed.compareAndSet(false, true)) {
				try {
					originalStream.close();
				}
				catch (IOException e) {
					handleIOException(e);
				}
				finally {
					fs.unregisterOutputStream(this);
				}
			}
		}
}