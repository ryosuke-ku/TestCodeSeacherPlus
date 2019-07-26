// clone pairs:7629:78%
// 7572:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/operators/async/queue/UnorderedStreamElementQueue.java

public class Nicad_t2_flink280
{
	public AsyncResult peekBlockingly() throws InterruptedException {
		lock.lockInterruptibly();

		try {
			while (completedQueue.isEmpty()) {
				hasCompletedEntries.await();
			}

			LOG.debug("Peeked head element from unordered stream element queue with filling degree " +
				"({}/{}).", numberEntries, capacity);

			return completedQueue.peek();
		} finally {
			lock.unlock();
		}
	}
}