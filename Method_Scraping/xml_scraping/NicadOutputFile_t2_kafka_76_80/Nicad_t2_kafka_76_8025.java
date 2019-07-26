// clone pairs:879:76%
// 393:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/MeteredSessionStore.java

public class Nicad_t2_kafka_76_8025
{
    public void put(final Windowed<K> sessionKey,
                    final V aggregate) {
        Objects.requireNonNull(sessionKey, "sessionKey can't be null");
        final long startNs = time.nanoseconds();
        try {
            final Bytes key = keyBytes(sessionKey.key());
            wrapped().put(new Windowed<>(key, sessionKey.window()), serdes.rawValue(aggregate));
        } catch (final ProcessorStateException e) {
            final String message = String.format(e.getMessage(), sessionKey.key(), aggregate);
            throw new ProcessorStateException(message, e);
        } finally {
            metrics.recordLatency(putTime, startNs, time.nanoseconds());
        }
    }
}