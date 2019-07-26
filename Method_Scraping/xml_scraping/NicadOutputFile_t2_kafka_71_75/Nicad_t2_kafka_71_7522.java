// clone pairs:1022:75%
// 474:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/CachingWindowStore.java

public class Nicad_t2_kafka_71_7522
{
    private void initInternal(final InternalProcessorContext context) {
        this.context = context;
        final String topic = ProcessorStateManager.storeChangelogTopic(context.applicationId(), name());

        bytesSerdes = new StateSerdes<>(
            topic,
            Serdes.Bytes(),
            Serdes.ByteArray());
        name = context.taskId() + "-" + name();
        cache = this.context.getCache();

        cache.addDirtyEntryFlushListener(name, entries -> {
            for (final ThreadCache.DirtyEntry entry : entries) {
                putAndMaybeForward(entry, context);
            }
        });
    }
}