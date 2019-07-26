// clone pairs:5686:77%
// 6044:flink/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/ClosableBlockingQueue.java

public class Nicad_t2_flink147
{
	public E poll() {
		lock.lock();
		try {
			if (open) {
				if (elements.size() > 0) {
					return elements.removeFirst();
				} else {
					return null;
				}
			} else {
				throw new IllegalStateException("queue is closed");
			}
		} finally {
			lock.unlock();
		}
	}
}