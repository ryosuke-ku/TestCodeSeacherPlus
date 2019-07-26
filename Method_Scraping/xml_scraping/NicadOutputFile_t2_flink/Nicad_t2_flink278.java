// clone pairs:7627:78%
// 7568:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/operators/async/queue/OrderedStreamElementQueue.java

public class Nicad_t2_flink278
{
	public AsyncResult poll() throws InterruptedException {
		lock.lockInterruptibly();

		try {
			while (queue.isEmpty() || !queue.peek().isDone()) {
				headIsCompleted.await();
			}

			notFull.signalAll();

			LOG.debug("Polled head element from ordered stream element queue. New filling degree " +
				"({}/{}).", queue.size() - 1, capacity);

			return queue.poll();
		} finally {
			lock.unlock();
		}
	}
}