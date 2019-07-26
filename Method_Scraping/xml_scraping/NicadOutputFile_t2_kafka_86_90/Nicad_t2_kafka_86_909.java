// clone pairs:1468:90%
// 818:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/ThreadCache.java

public class Nicad_t2_kafka_86_909
{
    public long size() {
        long size = 0;
        for (final NamedCache cache : caches.values()) {
            size += cache.size();
            if (isOverflowing(size)) {
                return Long.MAX_VALUE;
            }
        }
        return size;
    }
}