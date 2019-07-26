// clone pairs:1559:75%
// 1349:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/GroupingShuffleReader.java

public class Nicad_t1_beam_new284
{
  public void GroupingShuffleReader(
      PipelineOptions options,
      byte[] shuffleReaderConfig,
      @Nullable String startShufflePosition,
      @Nullable String stopShufflePosition,
      Coder<WindowedValue<KV<K, Iterable<V>>>> coder,
      BatchModeExecutionContext executionContext,
      DataflowOperationContext operationContext,
      ShuffleReadCounterFactory shuffleReadCounterFactory,
      boolean valuesAreSorted)
      throws Exception {
    this.options = options;
    this.shuffleReaderConfig = shuffleReaderConfig;
    this.startShufflePosition = startShufflePosition;
    this.stopShufflePosition = stopShufflePosition;
    this.executionContext = executionContext;
    this.operationContext = operationContext;
    this.shuffleReadCounterFactory = shuffleReadCounterFactory;
    initCoder(coder, valuesAreSorted);
    // We cannot initialize perOperationPerDatasetBytesCounter here, as it
    // depends on shuffleReaderConfig, which isn't populated yet.
  }
}