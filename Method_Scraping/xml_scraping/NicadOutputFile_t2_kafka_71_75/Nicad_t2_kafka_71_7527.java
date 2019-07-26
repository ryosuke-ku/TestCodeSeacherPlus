// clone pairs:1215:72%
// 576:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/CompositeReadOnlyKeyValueStore.java

public class Nicad_t2_kafka_71_7527
{
    public long approximateNumEntries() {
        final List<ReadOnlyKeyValueStore<K, V>> stores = storeProvider.stores(storeName, storeType);
        long total = 0;
        for (final ReadOnlyKeyValueStore<K, V> store : stores) {
            total += store.approximateNumEntries();
            if (total < 0) {
                return Long.MAX_VALUE;
            }
        }
        return total;
    }
}