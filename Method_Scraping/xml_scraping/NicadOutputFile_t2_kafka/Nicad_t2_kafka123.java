// clone pairs:1469:70%
// 820:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/MeteredKeyValueStore.java

public class Nicad_t2_kafka123
{
    public void putAll(final List<KeyValue<K, V>> entries) {
        if (putAllTime.shouldRecord()) {
            measureLatency(
                () -> {
                    wrapped().putAll(innerEntries(entries));
                    return null;
                },
                putAllTime);
        } else {
            wrapped().putAll(innerEntries(entries));
        }
    }
}