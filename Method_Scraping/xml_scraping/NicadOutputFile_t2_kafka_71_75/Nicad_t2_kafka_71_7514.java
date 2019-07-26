// clone pairs:735:73%
// 280:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/CompositeReadOnlyWindowStore.java

public class Nicad_t2_kafka_71_7514
{
    public V fetch(final K key, final long time) {
        Objects.requireNonNull(key, "key can't be null");
        final List<ReadOnlyWindowStore<K, V>> stores = provider.stores(storeName, windowStoreType);
        for (final ReadOnlyWindowStore<K, V> windowStore : stores) {
            try {
                final V result = windowStore.fetch(key, time);
                if (result != null) {
                    return result;
                }
            } catch (final InvalidStateStoreException e) {
                throw new InvalidStateStoreException(
                        "State store is not available anymore and may have been migrated to another instance; " +
                                "please re-discover its location from the state metadata.");
            }
        }
        return null;
    }
}