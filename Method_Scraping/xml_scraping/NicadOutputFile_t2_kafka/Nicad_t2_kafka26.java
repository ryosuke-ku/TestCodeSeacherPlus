// clone pairs:473:70%
// 185:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/CachingKeyValueStore.java

public class Nicad_t2_kafka26
{
    private void putAndMaybeForward(final ThreadCache.DirtyEntry entry,
                                    final InternalProcessorContext context) {
        if (flushListener != null) {
            final byte[] rawNewValue = entry.newValue();
            final byte[] rawOldValue = rawNewValue == null || sendOldValues ? wrapped().get(entry.key()) : null;

            // this is an optimization: if this key did not exist in underlying store and also not in the cache,
            // we can skip flushing to downstream as well as writing to underlying store
            if (rawNewValue != null || rawOldValue != null) {
                // we need to get the old values if needed, and then put to store, and then flush
                wrapped().put(entry.key(), entry.newValue());

                final ProcessorRecordContext current = context.recordContext();
                context.setRecordContext(entry.entry().context());
                try {
                    flushListener.apply(
                        entry.key().get(),
                        rawNewValue,
                        sendOldValues ? rawOldValue : null,
                        entry.entry().context().timestamp());
                } finally {
                    context.setRecordContext(current);
                }
            }
        } else {
            wrapped().put(entry.key(), entry.newValue());
        }
    }
}