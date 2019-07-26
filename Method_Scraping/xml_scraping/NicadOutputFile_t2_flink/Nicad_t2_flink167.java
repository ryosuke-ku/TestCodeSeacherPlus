// clone pairs:5842:77%
// 6204:flink/flink-runtime/src/main/java/org/apache/flink/runtime/io/network/partition/consumer/SingleInputGate.java

public class Nicad_t2_flink167
{
	private Optional<InputChannel> getChannel(boolean blocking) throws InterruptedException {
		synchronized (inputChannelsWithData) {
			while (inputChannelsWithData.size() == 0) {
				if (closeFuture.isDone()) {
					throw new IllegalStateException("Released");
				}

				if (blocking) {
					inputChannelsWithData.wait();
				}
				else {
					resetIsAvailable();
					return Optional.empty();
				}
			}

			InputChannel inputChannel = inputChannelsWithData.remove();
			enqueuedInputChannelsWithData.clear(inputChannel.getChannelIndex());
			return Optional.of(inputChannel);
		}
	}
}