// clone pairs:838:78%
// 361:kafka/core/src/main/scala/kafka/tools/StreamsResetter.java

public class Nicad_t2_kafka59
{
    public void shiftOffsetsBy(final Consumer<byte[], byte[]> client,
                               final Set<TopicPartition> inputTopicPartitions,
                               final long shiftBy) {
        final Map<TopicPartition, Long> endOffsets = client.endOffsets(inputTopicPartitions);
        final Map<TopicPartition, Long> beginningOffsets = client.beginningOffsets(inputTopicPartitions);

        final Map<TopicPartition, Long> topicPartitionsAndOffset = new HashMap<>(inputTopicPartitions.size());
        for (final TopicPartition topicPartition : inputTopicPartitions) {
            final long position = client.position(topicPartition);
            final long offset = position + shiftBy;
            topicPartitionsAndOffset.put(topicPartition, offset);
        }

        final Map<TopicPartition, Long> validatedTopicPartitionsAndOffset =
            checkOffsetRange(topicPartitionsAndOffset, beginningOffsets, endOffsets);

        for (final TopicPartition topicPartition : inputTopicPartitions) {
            client.seek(topicPartition, validatedTopicPartitionsAndOffset.get(topicPartition));
        }
    }
}