// clone pairs:817:71%
// 338:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/MeteredWindowStore.java

public class Nicad_t2_kafka_71_7517
{
    public V fetch(final K key,
                   final long timestamp) {
        final long startNs = time.nanoseconds();
        try {
            final byte[] result = wrapped().fetch(keyBytes(key), timestamp);
            if (result == null) {
                return null;
            }
            return serdes.valueFrom(result);
        } finally {
            metrics.recordLatency(fetchTime, startNs, time.nanoseconds());
        }
    }
}