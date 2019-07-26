// clone pairs:15597:100%
// 17515:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/IntrinsicMapTaskExecutorFactory.java

public class Nicad_t1_beam_new22439
{
  OperationNode createReadOperation(
      Network<Node, Edge> network,
      ParallelInstructionNode node,
      PipelineOptions options,
      ReaderFactory readerFactory,
      DataflowExecutionContext<?> executionContext,
      DataflowOperationContext operationContext)
      throws Exception {

    ParallelInstruction instruction = node.getParallelInstruction();
    ReadInstruction read = instruction.getRead();

    Source cloudSource = CloudSourceUtils.flattenBaseSpecs(read.getSource());
    CloudObject sourceSpec = CloudObject.fromSpec(cloudSource.getSpec());
    Coder<?> coder =
        CloudObjects.coderFromCloudObject(CloudObject.fromSpec(cloudSource.getCodec()));
    NativeReader<?> reader =
        readerFactory.create(sourceSpec, coder, options, executionContext, operationContext);
    OutputReceiver[] receivers = getOutputReceivers(network, node);
    return OperationNode.create(ReadOperation.create(reader, receivers, operationContext));
  }
}