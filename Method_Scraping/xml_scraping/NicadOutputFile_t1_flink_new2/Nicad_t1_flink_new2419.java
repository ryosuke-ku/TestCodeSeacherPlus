// clone pairs:9657:83%
// 10458:flink/flink-connectors/flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/ElasticsearchSinkBase.java

public class Nicad_t1_flink_new2419
{
	public void close() throws Exception {
		if (bulkProcessor != null) {
			bulkProcessor.close();
			bulkProcessor = null;
		}

		if (client != null) {
			client.close();
			client = null;
		}

		callBridge.cleanup();

		// make sure any errors from callbacks are rethrown
		checkErrorAndRethrow();
	}
}