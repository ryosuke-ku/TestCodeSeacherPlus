// clone pairs:2992:100%
// 4453:flink/flink-connectors/flink-connector-kafka-0.9/src/main/java/org/apache/flink/streaming/connectors/kafka/internal/Kafka09Fetcher.java

public class Nicad_t1_flink_new228
{
	public void runFetchLoop() throws Exception {
		try {
			final Handover handover = this.handover;

			// kick off the actual Kafka consumer
			consumerThread.start();

			while (running) {
				// this blocks until we get the next records
				// it automatically re-throws exceptions encountered in the consumer thread
				final ConsumerRecords<byte[], byte[]> records = handover.pollNext();

				// get the records for each topic partition
				for (KafkaTopicPartitionState<TopicPartition> partition : subscribedPartitionStates()) {

					List<ConsumerRecord<byte[], byte[]>> partitionRecords =
							records.records(partition.getKafkaPartitionHandle());

					for (ConsumerRecord<byte[], byte[]> record : partitionRecords) {

						final T value = deserializer.deserialize(record);

						if (deserializer.isEndOfStream(value)) {
							// end of stream signaled
							running = false;
							break;
						}

						// emit the actual record. this also updates offset state atomically
						// and deals with timestamps and watermark generation
						emitRecord(value, partition, record.offset(), record);
					}
				}
			}
		}
		finally {
			// this signals the consumer thread that no more work is to be done
			consumerThread.shutdown();
		}

		// on a clean exit, wait for the runner thread
		try {
			consumerThread.join();
		}
		catch (InterruptedException e) {
			// may be the result of a wake-up interruption after an exception.
			// we ignore this here and only restore the interruption state
			Thread.currentThread().interrupt();
		}
	}
}