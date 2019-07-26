// clone pairs:1429:80%
// 740:kafka/streams/src/main/java/org/apache/kafka/streams/StreamsConfig.java

public class Nicad_t2_kafka_76_8027
{
    public Serde defaultKeySerde() {
        final Object keySerdeConfigSetting = get(DEFAULT_KEY_SERDE_CLASS_CONFIG);
        try {
            final Serde<?> serde = getConfiguredInstance(DEFAULT_KEY_SERDE_CLASS_CONFIG, Serde.class);
            serde.configure(originals(), true);
            return serde;
        } catch (final Exception e) {
            throw new StreamsException(
                String.format("Failed to configure key serde %s", keySerdeConfigSetting), e);
        }
    }
}