// clone pairs:1224:72%
// 594:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/SessionWindowedKStreamImpl.java

public class Nicad_t2_kafka117
{
    private KTable<Windowed<K>, Long> doCount(final Materialized<K, Long, SessionStore<Bytes, byte[]>> materialized) {
        final MaterializedInternal<K, Long, SessionStore<Bytes, byte[]>> materializedInternal =
            new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);
        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(Serdes.Long());
        }

        return aggregateBuilder.build(
            AGGREGATE_NAME,
            materialize(materializedInternal),
            new KStreamSessionWindowAggregate<>(
                windows,
                materializedInternal.storeName(),
                aggregateBuilder.countInitializer,
                aggregateBuilder.countAggregator,
                countMerger),
            materializedInternal.queryableStoreName(),
            materializedInternal.keySerde() != null ? new WindowedSerdes.SessionWindowedSerde<>(materializedInternal.keySerde()) : null,
            materializedInternal.valueSerde());
    }
}