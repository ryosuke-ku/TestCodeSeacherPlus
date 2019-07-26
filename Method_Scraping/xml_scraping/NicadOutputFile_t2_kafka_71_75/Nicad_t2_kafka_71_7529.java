// clone pairs:1222:72%
// 590:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KGroupedStreamImpl.java

public class Nicad_t2_kafka_71_7529
{
    public <VR> KTable<K, VR> aggregate(final Initializer<VR> initializer,
                                        final Aggregator<? super K, ? super V, VR> aggregator,
                                        final Materialized<K, VR, KeyValueStore<Bytes, byte[]>> materialized) {
        Objects.requireNonNull(initializer, "initializer can't be null");
        Objects.requireNonNull(aggregator, "aggregator can't be null");
        Objects.requireNonNull(materialized, "materialized can't be null");

        final MaterializedInternal<K, VR, KeyValueStore<Bytes, byte[]>> materializedInternal =
            new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }

        return doAggregate(
            new KStreamAggregate<>(materializedInternal.storeName(), initializer, aggregator),
            AGGREGATE_NAME,
            materializedInternal
        );
    }
}