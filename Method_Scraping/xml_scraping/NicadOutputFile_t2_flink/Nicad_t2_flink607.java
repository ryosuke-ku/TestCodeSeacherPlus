// clone pairs:11303:70%
// 12772:flink/flink-test-utils-parent/flink-test-utils/src/main/java/org/apache/flink/networking/NetworkFailuresProxy.java

public class Nicad_t2_flink607
{
	private void setTrafficBlocked(boolean blocked) {
		this.blocked.set(blocked);
		if (blocked) {
			// synchronized for a race between blocking and creating new handlers
			synchronized (networkFailureHandlers) {
				for (NetworkFailureHandler failureHandler : networkFailureHandlers) {
					failureHandler.closeConnections();
				}
			}
		}
	}
}