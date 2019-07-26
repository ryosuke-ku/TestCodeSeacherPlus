// clone pairs:518:100%
// 349:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/IntrinsicMapTaskExecutorFactory.java

public class Nicad_t1_beam_new211
{
  <K> OperationNode createPartialGroupByKeyOperation(
      Network<Node, Edge> network,
      ParallelInstructionNode node,
      PipelineOptions options,
      DataflowExecutionContext<?> executionContext,
      DataflowOperationContext operationContext)
      throws Exception {

    ParallelInstruction instruction = node.getParallelInstruction();
    PartialGroupByKeyInstruction pgbk = instruction.getPartialGroupByKey();
    OutputReceiver[] receivers = getOutputReceivers(network, node);

    Coder<?> windowedCoder =
        CloudObjects.coderFromCloudObject(CloudObject.fromSpec(pgbk.getInputElementCodec()));
    if (!(windowedCoder instanceof WindowedValueCoder)) {
      throw new IllegalArgumentException(
          String.format(
              "unexpected kind of input coder for PartialGroupByKeyOperation: %s", windowedCoder));
    }
    Coder<?> elemCoder = ((WindowedValueCoder<?>) windowedCoder).getValueCoder();
    if (!(elemCoder instanceof KvCoder)) {
      throw new IllegalArgumentException(
          String.format(
              "unexpected kind of input element coder for PartialGroupByKeyOperation: %s",
              elemCoder));
    }

    @SuppressWarnings("unchecked")
    KvCoder<K, ?> keyedElementCoder = (KvCoder<K, ?>) elemCoder;

    CloudObject cloudUserFn =
        pgbk.getValueCombiningFn() != null
            ? CloudObject.fromSpec(pgbk.getValueCombiningFn())
            : null;
    ParDoFn fn =
        PartialGroupByKeyParDoFns.create(
            options,
            keyedElementCoder,
            cloudUserFn,
            pgbk.getSideInputs(),
            Arrays.<Receiver>asList(receivers),
            executionContext,
            operationContext);

    return OperationNode.create(new ParDoOperation(fn, receivers, operationContext));
  }
}