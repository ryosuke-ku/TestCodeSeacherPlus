// clone pairs:808:71%
// 328:kafka/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/DistributedHerder.java

public class Nicad_t2_kafka_71_7516
{
    private Callable<Void> getTaskStoppingCallable(final ConnectorTaskId taskId) {
        return new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                worker.stopAndAwaitTask(taskId);
                return null;
            }
        };
    }
}