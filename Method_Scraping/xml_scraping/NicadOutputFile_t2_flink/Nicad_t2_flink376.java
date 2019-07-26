// clone pairs:9687:75%
// 10562:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/operators/async/queue/OrderedStreamElementQueue.java

public class Nicad_t2_flink376
{
	public AsyncResult peekBlockingly() throws InterruptedException {
		lock.lockInterruptibly();

		try {
			while (queue.isEmpty() || !queue.peek().isDone()) {
				headIsCompleted.await();
			}

			LOG.debug("Peeked head element from ordered stream element queue with filling degree " +
				"({}/{}).", queue.size(), capacity);

			return queue.peek();
		} finally {
			lock.unlock();
		}
	}
}