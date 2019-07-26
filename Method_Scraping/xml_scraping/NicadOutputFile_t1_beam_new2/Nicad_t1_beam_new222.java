// clone pairs:772:100%
// 539:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/IntrinsicMapTaskExecutorFactory.java

public class Nicad_t1_beam_new222
{
  static Function<Node, Node> createOutputReceiversTransform(
      final String stageName, final CounterFactory counterFactory) {
    return new TypeSafeNodeFunction<InstructionOutputNode>(InstructionOutputNode.class) {
      @Override
      public Node typedApply(InstructionOutputNode input) {
        InstructionOutput cloudOutput = input.getInstructionOutput();
        OutputReceiver outputReceiver = new OutputReceiver();
        Coder<?> coder =
            CloudObjects.coderFromCloudObject(CloudObject.fromSpec(cloudOutput.getCodec()));

        @SuppressWarnings("unchecked")
        ElementCounter outputCounter =
            new DataflowOutputCounter(
                cloudOutput.getName(),
                new ElementByteSizeObservableCoder<>(coder),
                counterFactory,
                NameContext.create(
                    stageName,
                    cloudOutput.getOriginalName(),
                    cloudOutput.getSystemName(),
                    cloudOutput.getName()));
        outputReceiver.addOutputCounter(outputCounter);

        return OutputReceiverNode.create(outputReceiver, coder, input.getPcollectionId());
      }
    };
  }
}