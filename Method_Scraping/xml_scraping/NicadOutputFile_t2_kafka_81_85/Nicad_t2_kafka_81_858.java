// clone pairs:646:82%
// 247:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/CompositeReadOnlyWindowStore.java

public class Nicad_t2_kafka_81_858
{
    public WindowStoreIterator<V> fetch(final K key,
                                        final long timeFrom,
                                        final long timeTo) {
        Objects.requireNonNull(key, "key can't be null");
        final List<ReadOnlyWindowStore<K, V>> stores = provider.stores(storeName, windowStoreType);
        for (final ReadOnlyWindowStore<K, V> windowStore : stores) {
            try {
                final WindowStoreIterator<V> result = windowStore.fetch(key, timeFrom, timeTo);
                if (!result.hasNext()) {
                    result.close();
                } else {
                    return result;
                }
            } catch (final InvalidStateStoreException e) {
                throw new InvalidStateStoreException(
                        "State store is not available anymore and may have been migrated to another instance; " +
                                "please re-discover its location from the state metadata.");
            }
        }
        return KeyValueIterators.emptyWindowStoreIterator();
    }
}