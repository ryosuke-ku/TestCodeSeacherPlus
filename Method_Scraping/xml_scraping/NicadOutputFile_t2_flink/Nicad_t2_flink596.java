// clone pairs:10784:72%
// 11874:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/operators/async/queue/OrderedStreamElementQueue.java

public class Nicad_t2_flink596
{
	private void onCompleteHandler(StreamElementQueueEntry<?> streamElementQueueEntry) throws InterruptedException {
		lock.lockInterruptibly();

		try {
			if (!queue.isEmpty() && queue.peek().isDone()) {
				LOG.debug("Signal ordered stream element queue has completed head element.");
				headIsCompleted.signalAll();
			}
		} finally {
			lock.unlock();
		}
	}
}