// clone pairs:10276:72%
// 11318:flink/flink-core/src/main/java/org/apache/flink/core/fs/LimitedConnectionsFileSystem.java

public class Nicad_t2_flink498
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