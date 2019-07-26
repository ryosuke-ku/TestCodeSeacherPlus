// clone pairs:10779:90%
// 11864:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/operators/async/queue/OrderedStreamElementQueue.java

public class Nicad_t2_flink591
{
	public <T> void put(StreamElementQueueEntry<T> streamElementQueueEntry) throws InterruptedException {
		lock.lockInterruptibly();

		try {
			while (queue.size() >= capacity) {
				notFull.await();
			}

			addEntry(streamElementQueueEntry);
		} finally {
			lock.unlock();
		}
	}
}