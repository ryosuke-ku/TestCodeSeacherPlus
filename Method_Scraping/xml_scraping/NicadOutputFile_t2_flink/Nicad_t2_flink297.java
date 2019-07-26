// clone pairs:8010:76%
// 8152:flink/flink-runtime/src/main/java/org/apache/flink/runtime/io/network/netty/CreditBasedPartitionRequestClientHandler.java

public class Nicad_t2_flink297
{
		public void operationComplete(ChannelFuture future) throws Exception {
			try {
				if (future.isSuccess()) {
					writeAndFlushNextMessageIfPossible(future.channel());
				} else if (future.cause() != null) {
					notifyAllChannelsOfErrorAndClose(future.cause());
				} else {
					notifyAllChannelsOfErrorAndClose(new IllegalStateException("Sending cancelled by user."));
				}
			} catch (Throwable t) {
				notifyAllChannelsOfErrorAndClose(t);
			}
		}
}