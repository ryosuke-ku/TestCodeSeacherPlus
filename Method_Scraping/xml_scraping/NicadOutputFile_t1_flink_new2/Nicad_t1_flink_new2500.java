// clone pairs:10732:72%
// 11704:flink/flink-runtime/src/main/java/org/apache/flink/runtime/io/network/netty/PartitionRequestClientHandler.java

public class Nicad_t1_flink_new2500
{
	private void checkError() throws IOException {
		final Throwable t = channelError.get();

		if (t != null) {
			if (t instanceof IOException) {
				throw (IOException) t;
			}
			else {
				throw new IOException("There has been an error in the channel.", t);
			}
		}
	}
}