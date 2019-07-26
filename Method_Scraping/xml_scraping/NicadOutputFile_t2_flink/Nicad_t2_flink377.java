// clone pairs:9688:75%
// 10564:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/runtime/tasks/mailbox/MailboxImpl.java

public class Nicad_t2_flink377
{
	public Runnable takeMail() throws InterruptedException {
		final ReentrantLock lock = this.lock;
		lock.lockInterruptibly();
		try {
			while (isEmpty()) {
				notEmpty.await();
			}
			return takeInternal();
		} finally {
			lock.unlock();
		}
	}
}