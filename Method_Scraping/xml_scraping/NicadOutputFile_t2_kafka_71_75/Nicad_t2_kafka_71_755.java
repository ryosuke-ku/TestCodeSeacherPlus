// clone pairs:256:74%
// 67:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/AssignedStreamsTasks.java

public class Nicad_t2_kafka_71_755
{
    int process(final long now) {
        int processed = 0;

        final Iterator<Map.Entry<TaskId, StreamTask>> it = running.entrySet().iterator();
        while (it.hasNext()) {
            final StreamTask task = it.next().getValue();
            try {
                if (task.isProcessable(now) && task.process()) {
                    processed++;
                }
            } catch (final TaskMigratedException e) {
                log.info("Failed to process stream task {} since it got migrated to another thread already. " +
                        "Closing it as zombie before triggering a new rebalance.", task.id());
                final RuntimeException fatalException = closeZombieTask(task);
                if (fatalException != null) {
                    throw fatalException;
                }
                it.remove();
                throw e;
            } catch (final RuntimeException e) {
                log.error("Failed to process stream task {} due to the following error:", task.id(), e);
                throw e;
            }
        }

        return processed;
    }
}