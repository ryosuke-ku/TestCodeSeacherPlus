// clone pairs:10796:72%
// 11819:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/runtime/tasks/mailbox/MailboxImpl.java

public class Nicad_t1_flink_new2515
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