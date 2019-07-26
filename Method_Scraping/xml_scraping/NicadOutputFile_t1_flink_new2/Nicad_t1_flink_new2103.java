// clone pairs:6692:100%
// 6739:flink/flink-connectors/flink-connector-kafka-0.9/src/main/java/org/apache/flink/streaming/connectors/kafka/internal/Kafka09Fetcher.java

public class Nicad_t1_flink_new2103
{
	protected void doCommitInternalOffsetsToKafka(
			Map<KafkaTopicPartition, Long> offsets,
			@Nonnull KafkaCommitCallback commitCallback) throws Exception {

		@SuppressWarnings("unchecked")
		List<KafkaTopicPartitionState<TopicPartition>> partitions = subscribedPartitionStates();

		Map<TopicPartition, OffsetAndMetadata> offsetsToCommit = new HashMap<>(partitions.size());

		for (KafkaTopicPartitionState<TopicPartition> partition : partitions) {
			Long lastProcessedOffset = offsets.get(partition.getKafkaTopicPartition());
			if (lastProcessedOffset != null) {
				checkState(lastProcessedOffset >= 0, "Illegal offset value to commit");

				// committed offsets through the KafkaConsumer need to be 1 more than the last processed offset.
				// This does not affect Flink's checkpoints/saved state.
				long offsetToCommit = lastProcessedOffset + 1;

				offsetsToCommit.put(partition.getKafkaPartitionHandle(), new OffsetAndMetadata(offsetToCommit));
				partition.setCommittedOffset(offsetToCommit);
			}
		}

		// record the work to be committed by the main consumer thread and make sure the consumer notices that
		consumerThread.setOffsetsToCommit(offsetsToCommit, commitCallback);
	}
}