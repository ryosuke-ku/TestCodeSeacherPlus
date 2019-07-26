// clone pairs:1085:90%
// 552:kafka/clients/src/main/java/org/apache/kafka/clients/consumer/KafkaConsumer.java

public class Nicad_t2_kafka_86_903
{
    public void pause(Collection<TopicPartition> partitions) {
        acquireAndEnsureOpen();
        try {
            log.debug("Pausing partitions {}", partitions);
            for (TopicPartition partition: partitions) {
                subscriptions.pause(partition);
            }
        } finally {
            release();
        }
    }
}