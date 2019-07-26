// clone pairs:7698:71%
// 7560:flink/flink-runtime/src/main/java/org/apache/flink/runtime/highavailability/zookeeper/ZooKeeperHaServices.java

public class Nicad_t1_flink_new2129
{
	public void close() throws Exception {
		Throwable exception = null;

		try {
			blobStoreService.close();
		} catch (Throwable t) {
			exception = t;
		}

		internalClose();

		if (exception != null) {
			ExceptionUtils.rethrowException(exception, "Could not properly close the ZooKeeperHaServices.");
		}
	}
}