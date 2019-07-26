// clone pairs:1004:75%
// 440:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java

public class Nicad_t2_kafka79
{
    public void to(final String topic, final Produced<K, V> produced) {
        Objects.requireNonNull(topic, "topic can't be null");
        Objects.requireNonNull(produced, "Produced can't be null");
        final ProducedInternal<K, V> producedInternal = new ProducedInternal<>(produced);
        if (producedInternal.keySerde() == null) {
            producedInternal.withKeySerde(keySerde);
        }
        if (producedInternal.valueSerde() == null) {
            producedInternal.withValueSerde(valSerde);
        }
        to(new StaticTopicNameExtractor<>(topic), producedInternal);
    }
}