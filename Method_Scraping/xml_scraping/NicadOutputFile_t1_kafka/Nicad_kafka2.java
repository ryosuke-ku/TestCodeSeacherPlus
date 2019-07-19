// clone pairs:119:87%
// 32:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/AssignedStreamsTasks.java

public class Nicad_kafka2
{
    int maybeCommitPerUserRequested() {
        int committed = 0;
        RuntimeException firstException = null;

        for (final Iterator<StreamTask> it = running().iterator(); it.hasNext(); ) {
            final StreamTask task = it.next();
            try {
                if (task.commitRequested() && task.commitNeeded()) {
                    task.commit();
                    committed++;
                    log.debug("Committed active task {} per user request in", task.id());
                }
            } catch (final TaskMigratedException e) {
                log.info("Failed to commit {} since it got migrated to another thread already. " +
                        "Closing it as zombie before triggering a new rebalance.", task.id());
                final RuntimeException fatalException = closeZombieTask(task);
                if (fatalException != null) {
                    throw fatalException;
                }
                it.remove();
                throw e;
            } catch (final RuntimeException t) {
                log.error("Failed to commit StreamTask {} due to the following error:",
                        task.id(),
                        t);
                if (firstException == null) {
                    firstException = t;
                }
            }
        }

        if (firstException != null) {
            throw firstException;
        }

        return committed;
    }
}