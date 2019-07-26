// clone pairs:5836:77%
// 6179:flink/flink-runtime/src/main/java/org/apache/flink/runtime/highavailability/zookeeper/ZooKeeperHaServices.java

public class Nicad_t1_flink_new264
{
	public void closeAndCleanupAllData() throws Exception {
		LOG.info("Close and clean up all data for ZooKeeperHaServices.");

		Throwable exception = null;

		try {
			blobStoreService.closeAndCleanupAllData();
		} catch (Throwable t) {
			exception = t;
		}

		try {
			cleanupZooKeeperPaths();
		} catch (Throwable t) {
			exception = ExceptionUtils.firstOrSuppressed(t, exception);
		}

		internalClose();

		if (exception != null) {
			ExceptionUtils.rethrowException(exception, "Could not properly close and clean up all data of ZooKeeperHaServices.");
		}
	}
}