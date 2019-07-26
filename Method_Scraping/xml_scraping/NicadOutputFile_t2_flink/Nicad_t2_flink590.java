// clone pairs:10778:72%
// 11862:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/operators/async/queue/OrderedStreamElementQueue.java

public class Nicad_t2_flink590
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