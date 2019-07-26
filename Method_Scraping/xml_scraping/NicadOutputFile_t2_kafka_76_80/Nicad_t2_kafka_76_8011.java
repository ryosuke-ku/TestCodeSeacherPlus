// clone pairs:640:76%
// 245:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/CompositeReadOnlyKeyValueStore.java

public class Nicad_t2_kafka_76_8011
{
    public KeyValueIterator<K, V> range(final K from, final K to) {
        Objects.requireNonNull(from);
        Objects.requireNonNull(to);
        final NextIteratorFunction<K, V, ReadOnlyKeyValueStore<K, V>> nextIteratorFunction = new NextIteratorFunction<K, V, ReadOnlyKeyValueStore<K, V>>() {
            @Override
            public KeyValueIterator<K, V> apply(final ReadOnlyKeyValueStore<K, V> store) {
                try {
                    return store.range(from, to);
                } catch (final InvalidStateStoreException e) {
                    throw new InvalidStateStoreException("State store is not available anymore and may have been migrated to another instance; please re-discover its location from the state metadata.");
                }
            }
        };
        final List<ReadOnlyKeyValueStore<K, V>> stores = storeProvider.stores(storeName, storeType);
        return new DelegatingPeekingKeyValueIterator<>(storeName, new CompositeKeyValueIterator<>(stores.iterator(), nextIteratorFunction));
    }
}