// clone pairs:7428:71%
// 7437:flink/flink-connectors/flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java

public class Nicad_t1_flink_new2123
{
	public void shutdownFetcher() {
		running = false;

		if (mainThread != null) {
			mainThread.interrupt(); // the main thread may be sleeping for the discovery interval
		}

		if (watermarkTracker != null) {
			watermarkTracker.close();
		}
		this.recordEmitter.stop();

		if (LOG.isInfoEnabled()) {
			LOG.info("Shutting down the shard consumer threads of subtask {} ...", indexOfThisConsumerSubtask);
		}
		shardConsumersExecutor.shutdownNow();
	}
}