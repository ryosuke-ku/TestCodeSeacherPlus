// clone pairs:10782:72%
// 11870:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/operators/async/queue/OrderedStreamElementQueue.java

public class Nicad_t2_flink594
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