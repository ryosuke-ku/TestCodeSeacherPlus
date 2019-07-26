// clone pairs:20378:90%
// 29519:flink/flink-table/flink-sql-client/src/main/java/org/apache/flink/table/client/gateway/local/ExecutionContext.java

public class Nicad_t2_flink1064
{
	private static TableSource<?> createTableSource(ExecutionEntry execution, Map<String, String> sourceProperties, ClassLoader classLoader) {
		if (execution.isStreamingExecution()) {
			final StreamTableSourceFactory<?> factory = (StreamTableSourceFactory<?>)
				TableFactoryService.find(StreamTableSourceFactory.class, sourceProperties, classLoader);
			return factory.createStreamTableSource(sourceProperties);
		} else if (execution.isBatchExecution()) {
			final BatchTableSourceFactory<?> factory = (BatchTableSourceFactory<?>)
				TableFactoryService.find(BatchTableSourceFactory.class, sourceProperties, classLoader);
			return factory.createBatchTableSource(sourceProperties);
		}
		throw new SqlExecutionException("Unsupported execution type for sources.");
	}
}