// clone pairs:2119:80%
// 2120:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KGroupedStreamImpl.java

public class Nicad_t2_kafka223
{
    private KTable<K, Long> doCount(final Materialized<K, Long, KeyValueStore<Bytes, byte[]>> materialized) {
        final MaterializedInternal<K, Long, KeyValueStore<Bytes, byte[]>> materializedInternal =
            new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(Serdes.Long());
        }

        return doAggregate(
            new KStreamAggregate<>(materializedInternal.storeName(), aggregateBuilder.countInitializer, aggregateBuilder.countAggregator),
            AGGREGATE_NAME,
            materializedInternal);
    }
}