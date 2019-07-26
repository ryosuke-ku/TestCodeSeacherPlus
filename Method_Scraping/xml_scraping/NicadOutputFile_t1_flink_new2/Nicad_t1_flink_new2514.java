// clone pairs:10795:72%
// 11817:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/runtime/tasks/mailbox/MailboxImpl.java

public class Nicad_t1_flink_new2514
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