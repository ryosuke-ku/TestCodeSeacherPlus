// clone pairs:146:100%
// 39:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/IntrinsicMapTaskExecutorFactory.java

public class Nicad_t1_beam_2nd6
{
  Function<Node, Node> createOperationTransformForParallelInstructionNodes(
      final String stageName,
      final Network<Node, Edge> network,
      final PipelineOptions options,
      final ReaderFactory readerFactory,
      final SinkFactory sinkFactory,
      final DataflowExecutionContext<?> executionContext) {

    return new TypeSafeNodeFunction<ParallelInstructionNode>(ParallelInstructionNode.class) {
      @Override
      public Node typedApply(ParallelInstructionNode node) {
        ParallelInstruction instruction = node.getParallelInstruction();
        NameContext nameContext =
            NameContext.create(
                stageName,
                instruction.getOriginalName(),
                instruction.getSystemName(),
                instruction.getName());
        try {
          DataflowOperationContext context = executionContext.createOperationContext(nameContext);
          if (instruction.getRead() != null) {
            return createReadOperation(
                network, node, options, readerFactory, executionContext, context);
          } else if (instruction.getWrite() != null) {
            return createWriteOperation(node, options, sinkFactory, executionContext, context);
          } else if (instruction.getParDo() != null) {
            return createParDoOperation(network, node, options, executionContext, context);
          } else if (instruction.getPartialGroupByKey() != null) {
            return createPartialGroupByKeyOperation(
                network, node, options, executionContext, context);
          } else if (instruction.getFlatten() != null) {
            return createFlattenOperation(network, node, context);
          } else {
            throw new IllegalArgumentException(
                String.format("Unexpected instruction: %s", instruction));
          }
        } catch (Exception e) {
          throw new RuntimeException(e);
        }
      }
    };
  }
}