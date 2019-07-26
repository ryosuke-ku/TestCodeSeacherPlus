// clone pairs:876:76%
// 387:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KGroupedStreamImpl.java

public class Nicad_t2_kafka68
{
    public KTable<K, V> reduce(final Reducer<V> reducer,
                               final Materialized<K, V, KeyValueStore<Bytes, byte[]>> materialized) {
        Objects.requireNonNull(reducer, "reducer can't be null");
        Objects.requireNonNull(materialized, "materialized can't be null");

        final MaterializedInternal<K, V, KeyValueStore<Bytes, byte[]>> materializedInternal =
            new MaterializedInternal<>(materialized, builder, REDUCE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(valSerde);
        }

        return doAggregate(
            new KStreamReduce<>(materializedInternal.storeName(), reducer),
            REDUCE_NAME,
            materializedInternal
        );
    }
}