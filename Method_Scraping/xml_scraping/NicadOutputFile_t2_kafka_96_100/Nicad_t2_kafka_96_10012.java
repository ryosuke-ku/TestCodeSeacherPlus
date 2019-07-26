// clone pairs:1037:100%
// 504:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/MeteredKeyValueStore.java

public class Nicad_t2_kafka_96_10012
{
    public V get(final K key) {
        try {
            if (getTime.shouldRecord()) {
                return measureLatency(() -> outerValue(wrapped().get(keyBytes(key))), getTime);
            } else {
                return outerValue(wrapped().get(keyBytes(key)));
            }
        } catch (final ProcessorStateException e) {
            final String message = String.format(e.getMessage(), key);
            throw new ProcessorStateException(message, e);
        }
    }
}