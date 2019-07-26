// clone pairs:1430:80%
// 742:kafka/streams/src/main/java/org/apache/kafka/streams/StreamsConfig.java

public class Nicad_t2_kafka_76_8028
{
    private Map<String, Object> getCommonConsumerConfigs() {
        final Map<String, Object> clientProvidedProps = getClientPropsWithPrefix(CONSUMER_PREFIX, ConsumerConfig.configNames());

        checkIfUnexpectedUserSpecifiedConsumerConfig(clientProvidedProps, NON_CONFIGURABLE_CONSUMER_DEFAULT_CONFIGS);
        checkIfUnexpectedUserSpecifiedConsumerConfig(clientProvidedProps, NON_CONFIGURABLE_CONSUMER_EOS_CONFIGS);

        final Map<String, Object> consumerProps = new HashMap<>(eosEnabled ? CONSUMER_EOS_OVERRIDES : CONSUMER_DEFAULT_OVERRIDES);
        consumerProps.putAll(getClientCustomProps());
        consumerProps.putAll(clientProvidedProps);

        // bootstrap.servers should be from StreamsConfig
        consumerProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, originals().get(BOOTSTRAP_SERVERS_CONFIG));

        return consumerProps;
    }
}