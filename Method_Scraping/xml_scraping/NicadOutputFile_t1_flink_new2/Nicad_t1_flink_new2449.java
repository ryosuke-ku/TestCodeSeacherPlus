// clone pairs:10143:72%
// 11071:flink/flink-core/src/main/java/org/apache/flink/util/ExceptionUtils.java

public class Nicad_t1_flink_new2449
{
	public static void rethrowIOException(Throwable t) throws IOException {
		if (t instanceof IOException) {
			throw (IOException) t;
		}
		else if (t instanceof RuntimeException) {
			throw (RuntimeException) t;
		}
		else if (t instanceof Error) {
			throw (Error) t;
		}
		else {
			throw new IOException(t.getMessage(), t);
		}
	}
}