// clone pairs:27592:70%
// 42995:flink/flink-runtime/src/main/java/org/apache/flink/runtime/resourcemanager/ResourceManager.java

public class Nicad_t1_flink_new27458
{
		public void notifyHeartbeatTimeout(final ResourceID resourceID) {
			runAsync(new Runnable() {
				@Override
				public void run() {
					log.info("The heartbeat of TaskManager with id {} timed out.", resourceID);

					closeTaskManagerConnection(
							resourceID,
							new TimeoutException("The heartbeat of TaskManager with id " + resourceID + "  timed out."));
				}
			});
		}
}