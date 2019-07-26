// clone pairs:10106:72%
// 11013:flink/flink-core/src/main/java/org/apache/flink/util/ResourceGuard.java

public class Nicad_t1_flink_new2435
{
	public void close() {

		synchronized (lock) {

			closed = true;

			while (leaseCount > 0) {

				try {
					lock.wait();
				} catch (InterruptedException ignore) {
					// Even on interruption, we cannot terminate the loop until all open leases are closed.
				}
			}
		}
	}
}