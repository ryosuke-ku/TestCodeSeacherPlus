// clone pairs:6437:93%
// 6568:flink/flink-runtime/src/main/java/org/apache/flink/runtime/highavailability/nonha/leaderelection/SingleLeaderElectionService.java

public class Nicad_t2_flink190
{
	void removeListener(EmbeddedLeaderRetrievalService service) {
		synchronized (lock) {
			// if the service was not even started, simply do nothing
			if (!service.running || shutdown) {
				return;
			}

			try {
				if (!listeners.remove(service)) {
					throw new IllegalStateException("leader retrieval service does not belong to this service");
				}

				// stop the service
				service.listener = null;
				service.running = false;
			}
			catch (Throwable t) {
				fatalError(t);
			}
		}
	}
}