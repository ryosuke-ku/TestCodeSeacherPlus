// clone pairs:1543:80%
// 968:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/CachingKeyValueStore.java

public class Nicad_t2_kafka_76_8029
{
    public void put(final Bytes key,
                    final byte[] value) {
        Objects.requireNonNull(key, "key cannot be null");
        validateStoreOpen();
        lock.writeLock().lock();
        try {
            // for null bytes, we still put it into cache indicating tombstones
            putInternal(key, value);
        } finally {
            lock.writeLock().unlock();
        }
    }
}