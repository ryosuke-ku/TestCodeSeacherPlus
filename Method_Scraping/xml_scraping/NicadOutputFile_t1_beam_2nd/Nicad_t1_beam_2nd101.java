// clone pairs:1667:72%
// 1412:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/UngroupedShuffleReader.java

public class Nicad_t1_beam_2nd101
{
  public void UngroupedShuffleReader(
      @SuppressWarnings("unused") PipelineOptions options,
      byte[] shuffleReaderConfig,
      @Nullable String startShufflePosition,
      @Nullable String stopShufflePosition,
      Coder<T> coder,
      BatchModeExecutionContext executionContext,
      DataflowOperationContext operationContext) {
    this.shuffleReaderConfig = shuffleReaderConfig;
    this.startShufflePosition = startShufflePosition;
    this.stopShufflePosition = stopShufflePosition;
    this.coder = coder;
    this.executionContext = executionContext;
    this.operationContext = operationContext;
  }
}