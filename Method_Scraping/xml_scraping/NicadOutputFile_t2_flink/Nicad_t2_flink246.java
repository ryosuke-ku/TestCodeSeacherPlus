// clone pairs:6855:80%
// 7002:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/operators/async/queue/OrderedStreamElementQueue.java

public class Nicad_t2_flink246
{
	public <T> boolean tryPut(StreamElementQueueEntry<T> streamElementQueueEntry) throws InterruptedException {
		lock.lockInterruptibly();

		try {
			if (queue.size() < capacity) {
				addEntry(streamElementQueueEntry);

				LOG.debug("Put element into ordered stream element queue. New filling degree " +
					"({}/{}).", queue.size(), capacity);

				return true;
			} else {
				LOG.debug("Failed to put element into ordered stream element queue because it " +
					"was full ({}/{}).", queue.size(), capacity);

				return false;
			}
		} finally {
			lock.unlock();
		}
	}
}