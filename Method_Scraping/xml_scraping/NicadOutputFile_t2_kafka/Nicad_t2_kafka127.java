// clone pairs:1771:70%
// 1424:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/ProcessorStateManager.java

public class Nicad_t2_kafka127
{
    public Map<TopicPartition, Long> checkpointed() {
        final Map<TopicPartition, Long> partitionsAndOffsets = new HashMap<>();

        for (final Map.Entry<String, StateRestoreCallback> entry : restoreCallbacks.entrySet()) {
            final String topicName = entry.getKey();
            final int partition = getPartition(topicName);
            final TopicPartition storePartition = new TopicPartition(topicName, partition);

            partitionsAndOffsets.put(storePartition, checkpointableOffsets.getOrDefault(storePartition, -1L));
        }
        return partitionsAndOffsets;
    }
}