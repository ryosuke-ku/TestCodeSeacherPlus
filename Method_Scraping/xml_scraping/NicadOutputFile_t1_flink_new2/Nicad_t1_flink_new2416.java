// clone pairs:9642:75%
// 10433:flink/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java

public class Nicad_t1_flink_new2416
{
	public void cancel() {
		// set ourselves as not running;
		// this would let the main discovery loop escape as soon as possible
		running = false;

		if (discoveryLoopThread != null) {

			if (partitionDiscoverer != null) {
				// we cannot close the discoverer here, as it is error-prone to concurrent access;
				// only wakeup the discoverer, the discovery loop will clean itself up after it escapes
				partitionDiscoverer.wakeup();
			}

			// the discovery loop may currently be sleeping in-between
			// consecutive discoveries; interrupt to shutdown faster
			discoveryLoopThread.interrupt();
		}

		// abort the fetcher, if there is one
		if (kafkaFetcher != null) {
			kafkaFetcher.cancel();
		}
	}
}