// clone pairs:1210:90%
// 566:kafka/streams/src/main/java/org/apache/kafka/streams/StreamsConfig.java

public class Nicad_t2_kafka_86_904
{
    public Map<String, Object> getRestoreConsumerConfigs(final String clientId) {
        final Map<String, Object> baseConsumerProps = getCommonConsumerConfigs();

        // Get restore consumer override configs
        final Map<String, Object> restoreConsumerProps = originalsWithPrefix(RESTORE_CONSUMER_PREFIX);
        for (final Map.Entry<String, Object> entry: restoreConsumerProps.entrySet()) {
            baseConsumerProps.put(entry.getKey(), entry.getValue());
        }

        // no need to set group id for a restore consumer
        baseConsumerProps.remove(ConsumerConfig.GROUP_ID_CONFIG);
        // add client id with stream client id prefix
        baseConsumerProps.put(CommonClientConfigs.CLIENT_ID_CONFIG, clientId);
        baseConsumerProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "none");

        return baseConsumerProps;
    }
}