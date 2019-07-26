// clone pairs:8876:76%
// 9817:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/runtime/tasks/mailbox/MailboxImpl.java

public class Nicad_t2_flink316
{
	public void putMail(@Nonnull Runnable letter) throws InterruptedException {
		final ReentrantLock lock = this.lock;
		lock.lockInterruptibly();
		try {
			while (isFull()) {
				notFull.await();
			}
			putInternal(letter);
		} finally {
			lock.unlock();
		}
	}
}