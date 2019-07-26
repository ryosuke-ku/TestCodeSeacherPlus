// clone pairs:10733:72%
// 11706:flink/flink-runtime/src/main/java/org/apache/flink/runtime/io/network/netty/CreditBasedPartitionRequestClientHandler.java

public class Nicad_t1_flink_new2501
{
	private void checkError() throws IOException {
		final Throwable t = channelError.get();

		if (t != null) {
			if (t instanceof IOException) {
				throw (IOException) t;
			} else {
				throw new IOException("There has been an error in the channel.", t);
			}
		}
	}
}