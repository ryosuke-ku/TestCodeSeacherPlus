// clone pairs:872:76%
// 379:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java

public class Nicad_t2_kafka65
{
    public KStream<K, V> through(final String topic, final Produced<K, V> produced) {
        Objects.requireNonNull(topic, "topic can't be null");
        Objects.requireNonNull(produced, "Produced can't be null");
        final ProducedInternal<K, V> producedInternal = new ProducedInternal<>(produced);
        if (producedInternal.keySerde() == null) {
            producedInternal.withKeySerde(keySerde);
        }
        if (producedInternal.valueSerde() == null) {
            producedInternal.withValueSerde(valSerde);
        }
        to(topic, producedInternal);
        return builder.stream(
            Collections.singleton(topic),
            new ConsumedInternal<>(
                producedInternal.keySerde(),
                producedInternal.valueSerde(),
                new FailOnInvalidTimestamp(),
                null
            )
        );
    }
}