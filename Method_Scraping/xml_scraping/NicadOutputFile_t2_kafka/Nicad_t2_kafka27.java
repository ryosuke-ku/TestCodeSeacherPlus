// clone pairs:481:70%
// 187:kafka/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/DistributedHerder.java

public class Nicad_t2_kafka27
{
    public void requestTaskReconfiguration(final String connName) {
        log.trace("Submitting connector task reconfiguration request {}", connName);

        addRequest(
                new Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        reconfigureConnectorTasksWithRetry(connName);
                        return null;
                    }
                },
                new Callback<Void>() {
                    @Override
                    public void onCompletion(Throwable error, Void result) {
                        if (error != null) {
                            log.error("Unexpected error during task reconfiguration: ", error);
                            log.error("Task reconfiguration for {} failed unexpectedly, this connector will not be properly reconfigured unless manually triggered.", connName);
                        }
                    }
                }
        );
    }
}