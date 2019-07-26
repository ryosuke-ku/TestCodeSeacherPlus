// clone pairs:742:80%
// 290:kafka/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/DistributedHerder.java

public class Nicad_t2_kafka_76_8013
{
    private Callable<Void> getTaskStartingCallable(final ConnectorTaskId taskId) {
        return new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                try {
                    startTask(taskId);
                } catch (Throwable t) {
                    log.error("Couldn't instantiate task {} because it has an invalid task configuration. This task will not execute until reconfigured.",
                            taskId, t);
                    onFailure(taskId, t);
                }
                return null;
            }
        };
    }
}