// clone pairs:997:83%
// 432:kafka/core/src/main/scala/kafka/tools/StreamsResetter.java

public class Nicad_t2_kafka_81_8516
{
    private void resetByDuration(final Consumer<byte[], byte[]> client,
                                 final Set<TopicPartition> inputTopicPartitions,
                                 final Duration duration) {
        final Instant now = Instant.now();
        final long timestamp = now.minus(duration).toEpochMilli();

        final Map<TopicPartition, Long> topicPartitionsAndTimes = new HashMap<>(inputTopicPartitions.size());
        for (final TopicPartition topicPartition : inputTopicPartitions) {
            topicPartitionsAndTimes.put(topicPartition, timestamp);
        }

        final Map<TopicPartition, OffsetAndTimestamp> topicPartitionsAndOffset = client.offsetsForTimes(topicPartitionsAndTimes);

        for (final TopicPartition topicPartition : inputTopicPartitions) {
            client.seek(topicPartition, topicPartitionsAndOffset.get(topicPartition).offset());
        }
    }
}