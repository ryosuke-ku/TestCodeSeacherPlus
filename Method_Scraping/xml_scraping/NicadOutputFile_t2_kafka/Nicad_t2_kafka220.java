// clone pairs:2073:80%
// 2028:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/TimeWindowedKStreamImpl.java

public class Nicad_t2_kafka220
{
    public <VR> KTable<Windowed<K>, VR> aggregate(final Initializer<VR> initializer,
                                                  final Aggregator<? super K, ? super V, VR> aggregator,
                                                  final Materialized<K, VR, WindowStore<Bytes, byte[]>> materialized) {
        Objects.requireNonNull(initializer, "initializer can't be null");
        Objects.requireNonNull(aggregator, "aggregator can't be null");
        Objects.requireNonNull(materialized, "materialized can't be null");
        final MaterializedInternal<K, VR, WindowStore<Bytes, byte[]>> materializedInternal =
            new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);
        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
        return aggregateBuilder.build(
            AGGREGATE_NAME,
            materialize(materializedInternal),
            new KStreamWindowAggregate<>(windows, materializedInternal.storeName(), initializer, aggregator),
            materializedInternal.queryableStoreName(),
            materializedInternal.keySerde() != null ? new FullTimeWindowedSerde<>(materializedInternal.keySerde(), windows.size()) : null,
            materializedInternal.valueSerde());
    }
}