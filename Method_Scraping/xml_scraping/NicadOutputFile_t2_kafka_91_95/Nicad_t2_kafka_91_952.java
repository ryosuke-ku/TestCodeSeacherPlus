// clone pairs:671:94%
// 255:kafka/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/IncrementalCooperativeAssignor.java

public class Nicad_t2_kafka_91_952
{
    protected void assignConnectors(List<WorkerLoad> workerAssignment, Collection<String> connectors) {
        workerAssignment.sort(WorkerLoad.connectorComparator());
        WorkerLoad first = workerAssignment.get(0);

        Iterator<String> load = connectors.iterator();
        while (load.hasNext()) {
            int firstLoad = first.connectorsSize();
            int upTo = IntStream.range(0, workerAssignment.size())
                    .filter(i -> workerAssignment.get(i).connectorsSize() > firstLoad)
                    .findFirst()
                    .orElse(workerAssignment.size());
            for (WorkerLoad worker : workerAssignment.subList(0, upTo)) {
                String connector = load.next();
                log.debug("Assigning connector {} to {}", connector, worker.worker());
                worker.assign(connector);
                if (!load.hasNext()) {
                    break;
                }
            }
        }
    }
}