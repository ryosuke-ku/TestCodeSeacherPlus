// clone pairs:1667:72%
// 1544:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/UngroupedShuffleReader.java

public class Nicad_t1_beam104
{
  public UngroupedShuffleReader(
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