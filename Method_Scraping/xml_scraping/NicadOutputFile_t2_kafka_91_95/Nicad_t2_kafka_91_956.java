// clone pairs:1010:91%
// 452:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/SessionWindowedSerializer.java

public class Nicad_t2_kafka_91_956
{
    public void configure(final Map<String, ?> configs, final boolean isKey) {
        if (inner == null) {
            final String propertyName = isKey ? StreamsConfig.DEFAULT_WINDOWED_KEY_SERDE_INNER_CLASS : StreamsConfig.DEFAULT_WINDOWED_VALUE_SERDE_INNER_CLASS;
            final String value = (String) configs.get(propertyName);
            try {
                inner = Serde.class.cast(Utils.newInstance(value, Serde.class)).serializer();
                inner.configure(configs, isKey);
            } catch (final ClassNotFoundException e) {
                throw new ConfigException(propertyName, value, "Serde class " + value + " could not be found.");
            }
        }
    }
}