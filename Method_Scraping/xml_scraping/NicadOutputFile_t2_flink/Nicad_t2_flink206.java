// clone pairs:6544:81%
// 6654:flink/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/ClosableBlockingQueue.java

public class Nicad_t2_flink206
{
	public boolean addIfOpen(E element) {
		requireNonNull(element);

		lock.lock();
		try {
			if (open) {
				elements.addLast(element);
				if (elements.size() == 1) {
					nonEmpty.signalAll();
				}
			}
			return open;
		} finally {
			lock.unlock();
		}
	}
}