// clone pairs:8875:76%
// 9815:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/runtime/tasks/mailbox/MailboxImpl.java

public class Nicad_t2_flink315
{
	public void waitUntilHasMail() throws InterruptedException {
		final ReentrantLock lock = this.lock;
		lock.lockInterruptibly();
		try {
			while (isEmpty()) {
				notEmpty.await();
			}
		} finally {
			lock.unlock();
		}
	}
}