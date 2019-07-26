// clone pairs:5810:88%
// 6156:flink/flink-runtime/src/main/java/org/apache/flink/runtime/highavailability/nonha/leaderelection/SingleLeaderElectionService.java

public class Nicad_t2_flink160
{
	void addListener(EmbeddedLeaderRetrievalService service, LeaderRetrievalListener listener) {
		synchronized (lock) {
			checkState(!shutdown, "leader election service is shut down");
			checkState(!service.running, "leader retrieval service is already started");

			try {
				if (!listeners.add(service)) {
					throw new IllegalStateException("leader retrieval service was added to this service multiple times");
				}

				service.listener = listener;
				service.running = true;

				// if we already have a leader, immediately notify this new listener
				if (leader != null) {
					notificationExecutor.execute(
							new NotifyOfLeaderCall(leaderAddress, leaderId, listener, LOG));
				}
			}
			catch (Throwable t) {
				fatalError(t);
			}
		}
	}
}