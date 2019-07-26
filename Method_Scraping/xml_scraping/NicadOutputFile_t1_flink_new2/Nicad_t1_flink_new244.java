// clone pairs:5040:70%
// 5631:flink/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java

public class Nicad_t1_flink_new244
{
	public void close() throws Exception {
		cancel();

		joinDiscoveryLoopThread();

		Exception exception = null;
		if (partitionDiscoverer != null) {
			try {
				partitionDiscoverer.close();
			} catch (Exception e) {
				exception = e;
			}
		}

		try {
			super.close();
		} catch (Exception e) {
			exception = ExceptionUtils.firstOrSuppressed(e, exception);
		}

		if (exception != null) {
			throw exception;
		}
	}
}