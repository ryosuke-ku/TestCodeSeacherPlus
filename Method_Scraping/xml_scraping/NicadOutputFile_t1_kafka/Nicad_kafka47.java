// clone pairs:1217:72%
// 581:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamTask.java

public class Nicad_kafka47
{
    private void initTopology() {
        // initialize the task by initializing all its processor nodes in the topology
        log.trace("Initializing processor nodes of the topology");
        for (final ProcessorNode node : topology.processors()) {
            processorContext.setCurrentNode(node);
            try {
                node.init(processorContext);
            } finally {
                processorContext.setCurrentNode(null);
            }
        }
    }
}