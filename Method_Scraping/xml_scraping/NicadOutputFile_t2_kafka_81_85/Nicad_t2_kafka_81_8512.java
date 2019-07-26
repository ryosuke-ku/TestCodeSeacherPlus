// clone pairs:877:84%
// 389:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/TimeWindowedKStreamImpl.java

public class Nicad_t2_kafka_81_8512
{
    public KTable<Windowed<K>, V> reduce(final Reducer<V> reducer, final Materialized<K, V, WindowStore<Bytes, byte[]>> materialized) {
        Objects.requireNonNull(reducer, "reducer can't be null");
        Objects.requireNonNull(materialized, "materialized can't be null");

        final MaterializedInternal<K, V, WindowStore<Bytes, byte[]>> materializedInternal =
            new MaterializedInternal<>(materialized, builder, REDUCE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(valSerde);
        }

        return aggregateBuilder.build(
            REDUCE_NAME,
            materialize(materializedInternal),
            new KStreamWindowAggregate<>(windows, materializedInternal.storeName(), aggregateBuilder.reduceInitializer, aggregatorForReducer(reducer)),
            materializedInternal.queryableStoreName(),
            materializedInternal.keySerde() != null ? new FullTimeWindowedSerde<>(materializedInternal.keySerde(), windows.size()) : null,
            materializedInternal.valueSerde());
    }
}