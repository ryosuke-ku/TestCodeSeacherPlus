// clone pairs:10786:72%
// 11878:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/runtime/tasks/mailbox/MailboxImpl.java

public class Nicad_t2_flink598
{
	public void waitUntilHasCapacity() throws InterruptedException {
		final ReentrantLock lock = this.lock;
		lock.lockInterruptibly();
		try {
			while (isFull()) {
				notFull.await();
			}
		} finally {
			lock.unlock();
		}
	}
}