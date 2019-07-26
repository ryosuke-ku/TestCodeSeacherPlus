// clone pairs:6463:100%
// 6584:flink/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/ClosableBlockingQueue.java

public class Nicad_t2_flink192
{
	public E peek() {
		lock.lock();
		try {
			if (open) {
				if (elements.size() > 0) {
					return elements.getFirst();
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