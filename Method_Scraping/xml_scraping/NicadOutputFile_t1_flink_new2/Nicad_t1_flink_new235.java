// clone pairs:3359:72%
// 4917:flink/flink-runtime/src/main/java/org/apache/flink/runtime/jobmanager/ZooKeeperSubmittedJobGraphStore.java

public class Nicad_t1_flink_new235
{
	public void stop() throws Exception {
		synchronized (cacheLock) {
			if (isRunning) {
				jobGraphListener = null;

				try {
					Exception exception = null;

					try {
						jobGraphsInZooKeeper.releaseAll();
					} catch (Exception e) {
						exception = e;
					}

					try {
						pathCache.close();
					} catch (Exception e) {
						exception = ExceptionUtils.firstOrSuppressed(e, exception);
					}

					if (exception != null) {
						throw new FlinkException("Could not properly stop the ZooKeeperSubmittedJobGraphStore.", exception);
					}
				} finally {
					isRunning = false;
				}
			}
		}
	}
}