// clone pairs:1009:100%
// 804:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/IntrinsicMapTaskExecutorFactory.java

public class Nicad_t1_beam40
{
  static OutputReceiver[] getOutputReceivers(Network<Node, Edge> network, Node node) {
    int outDegree = network.outDegree(node);
    if (outDegree == 0) {
      return EMPTY_OUTPUT_RECEIVER_ARRAY;
    }

    OutputReceiver[] receivers = new OutputReceiver[outDegree];
    Iterator<Node> receiverNodes = network.successors(node).iterator();
    int i = 0;
    do {
      receivers[i] = ((OutputReceiverNode) receiverNodes.next()).getOutputReceiver();
      i += 1;
    } while (receiverNodes.hasNext());

    return receivers;
  }
}