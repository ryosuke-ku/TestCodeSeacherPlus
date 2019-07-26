// clone pairs:5940:76%
// 6306:flink/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/ClosableBlockingQueue.java

public class Nicad_t2_flink171
{
	public E getElementBlocking() throws InterruptedException {
		lock.lock();
		try {
			while (open && elements.isEmpty()) {
				nonEmpty.await();
			}

			if (open) {
				return elements.removeFirst();
			} else {
				throw new IllegalStateException("queue is closed");
			}
		} finally {
			lock.unlock();
		}
	}
}