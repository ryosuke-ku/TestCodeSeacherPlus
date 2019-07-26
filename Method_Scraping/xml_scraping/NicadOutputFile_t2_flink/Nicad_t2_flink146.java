// clone pairs:5685:72%
// 6042:flink/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/ClosableBlockingQueue.java

public class Nicad_t2_flink146
{
	public List<E> pollBatch() {
		lock.lock();
		try {
			if (open) {
				if (elements.size() > 0) {
					ArrayList<E> result = new ArrayList<>(elements);
					elements.clear();
					return result;
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