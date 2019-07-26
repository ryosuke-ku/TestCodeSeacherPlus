// clone pairs:5066:80%
// 5678:flink/flink-runtime/src/main/java/org/apache/flink/runtime/io/network/partition/consumer/SingleInputGate.java

public class Nicad_t2_flink114
{
	private void queueChannel(InputChannel channel) {
		int availableChannels;

		CompletableFuture<?> toNotify = null;

		synchronized (inputChannelsWithData) {
			if (enqueuedInputChannelsWithData.get(channel.getChannelIndex())) {
				return;
			}
			availableChannels = inputChannelsWithData.size();

			inputChannelsWithData.add(channel);
			enqueuedInputChannelsWithData.set(channel.getChannelIndex());

			if (availableChannels == 0) {
				inputChannelsWithData.notifyAll();
				toNotify = isAvailable;
				isAvailable = AVAILABLE;
			}
		}

		if (toNotify != null) {
			toNotify.complete(null);
		}
	}
}