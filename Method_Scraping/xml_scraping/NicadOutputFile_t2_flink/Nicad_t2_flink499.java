// clone pairs:10277:72%
// 11320:flink/flink-core/src/main/java/org/apache/flink/core/fs/LimitedConnectionsFileSystem.java

public class Nicad_t2_flink499
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
					fs.unregisterInputStream(this);
				}
			}
		}
}