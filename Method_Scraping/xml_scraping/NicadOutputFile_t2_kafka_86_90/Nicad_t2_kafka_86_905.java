// clone pairs:1211:90%
// 568:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/TimestampedWindowStoreBuilder.java

public class Nicad_t2_kafka_86_905
{
    public TimestampedWindowStore<K, V> build() {
        WindowStore<Bytes, byte[]> store = storeSupplier.get();
        if (!(store instanceof TimestampedBytesStore)) {
            if (store.persistent()) {
                store = new WindowToTimestampedWindowByteStoreAdapter(store);
            } else {
                store = new InMemoryTimestampedWindowStoreMarker(store);
            }
        }
        return new MeteredTimestampedWindowStore<>(
            maybeWrapCaching(maybeWrapLogging(store)),
            storeSupplier.windowSize(),
            storeSupplier.metricsScope(),
            time,
            keySerde,
            valueSerde);
    }
}