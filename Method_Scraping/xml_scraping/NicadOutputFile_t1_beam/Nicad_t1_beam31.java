// clone pairs:660:100%
// 494:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/IntrinsicMapTaskExecutorFactory.java

public class Nicad_t1_beam31
{
  private OperationNode createParDoOperation(
      Network<Node, Edge> network,
      ParallelInstructionNode node,
      PipelineOptions options,
      DataflowExecutionContext<?> executionContext,
      DataflowOperationContext operationContext)
      throws Exception {

    ParallelInstruction instruction = node.getParallelInstruction();
    ParDoInstruction parDo = instruction.getParDo();

    TupleTag<?> mainOutputTag = tupleTag(parDo.getMultiOutputInfos().get(0));
    ImmutableMap.Builder<TupleTag<?>, Integer> outputTagsToReceiverIndicesBuilder =
        ImmutableMap.builder();
    int successorOffset = 0;
    for (Node successor : network.successors(node)) {
      for (Edge edge : network.edgesConnecting(node, successor)) {
        outputTagsToReceiverIndicesBuilder.put(
            tupleTag(((MultiOutputInfoEdge) edge).getMultiOutputInfo()), successorOffset);
      }
      successorOffset += 1;
    }
    ParDoFn fn =
        parDoFnFactory.create(
            options,
            CloudObject.fromSpec(parDo.getUserFn()),
            parDo.getSideInputs(),
            mainOutputTag,
            outputTagsToReceiverIndicesBuilder.build(),
            executionContext,
            operationContext);

    OutputReceiver[] receivers = getOutputReceivers(network, node);
    return OperationNode.create(new ParDoOperation(fn, receivers, operationContext));
  }
}