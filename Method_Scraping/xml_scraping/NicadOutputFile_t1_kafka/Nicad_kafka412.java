// clone pairs:2213:80%
// 2263:kafka/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/WorkerCoordinator.java

public class Nicad_kafka412
{
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof WorkerLoad)) {
                return false;
            }
            WorkerLoad that = (WorkerLoad) o;
            return worker.equals(that.worker) &&
                    connectors.equals(that.connectors) &&
                    tasks.equals(that.tasks);
        }
}