// clone pairs:741:80%
// 288:kafka/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/DistributedHerder.java

public class Nicad_t2_kafka_76_8012
{
    private Callable<Void> getConnectorStartingCallable(final String connectorName) {
        return new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                try {
                    startConnector(connectorName);
                } catch (Throwable t) {
                    log.error("Couldn't instantiate connector " + connectorName + " because it has an invalid connector " +
                            "configuration. This connector will not execute until reconfigured.", t);
                    onFailure(connectorName, t);
                }
                return null;
            }
        };
    }
}