// clone pairs:867:84%
// 373:kafka/connect/runtime/src/main/java/org/apache/kafka/connect/storage/KafkaConfigBackingStore.java

public class Nicad_t2_kafka62
{
    private KafkaBasedLog<String, byte[]> createKafkaBasedLog(String topic, Map<String, Object> producerProps,
                                                              Map<String, Object> consumerProps,
                                                              Callback<ConsumerRecord<String, byte[]>> consumedCallback,
                                                              final NewTopic topicDescription, final Map<String, Object> adminProps) {
        Runnable createTopics = new Runnable() {
            @Override
            public void run() {
                log.debug("Creating admin client to manage Connect internal config topic");
                try (TopicAdmin admin = new TopicAdmin(adminProps)) {
                    admin.createTopics(topicDescription);
                }
            }
        };
        return new KafkaBasedLog<>(topic, producerProps, consumerProps, consumedCallback, Time.SYSTEM, createTopics);
    }
}