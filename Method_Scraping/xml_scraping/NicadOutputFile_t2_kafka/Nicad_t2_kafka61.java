// clone pairs:866:84%
// 371:kafka/connect/runtime/src/main/java/org/apache/kafka/connect/storage/KafkaOffsetBackingStore.java

public class Nicad_t2_kafka61
{
    private KafkaBasedLog<byte[], byte[]> createKafkaBasedLog(String topic, Map<String, Object> producerProps,
                                                              Map<String, Object> consumerProps,
                                                              Callback<ConsumerRecord<byte[], byte[]>> consumedCallback,
                                                              final NewTopic topicDescription, final Map<String, Object> adminProps) {
        Runnable createTopics = new Runnable() {
            @Override
            public void run() {
                log.debug("Creating admin client to manage Connect internal offset topic");
                try (TopicAdmin admin = new TopicAdmin(adminProps)) {
                    admin.createTopics(topicDescription);
                }
            }
        };
        return new KafkaBasedLog<>(topic, producerProps, consumerProps, consumedCallback, Time.SYSTEM, createTopics);
    }
}