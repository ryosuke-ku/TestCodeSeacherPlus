// clone pairs:2154:90%
// 2187:kafka/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/WorkerCoordinator.java

public class Nicad_t1_kafka_new402
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