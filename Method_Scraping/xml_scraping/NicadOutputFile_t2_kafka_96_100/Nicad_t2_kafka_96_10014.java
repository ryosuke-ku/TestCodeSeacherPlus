// clone pairs:1422:100%
// 738:kafka/clients/src/main/java/org/apache/kafka/clients/consumer/KafkaConsumer.java

public class Nicad_t2_kafka_96_10014
{
    public void seekToBeginning(Collection<TopicPartition> partitions) {
        if (partitions == null)
            throw new IllegalArgumentException("Partitions collection cannot be null");

        acquireAndEnsureOpen();
        try {
            Collection<TopicPartition> parts = partitions.size() == 0 ? this.subscriptions.assignedPartitions() : partitions;
            subscriptions.requestOffsetReset(parts, OffsetResetStrategy.EARLIEST);
        } finally {
            release();
        }
    }
}