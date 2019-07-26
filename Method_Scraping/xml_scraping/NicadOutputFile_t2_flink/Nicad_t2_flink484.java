// clone pairs:10164:90%
// 11149:flink/flink-runtime/src/main/java/org/apache/flink/runtime/instance/InstanceManager.java

public class Nicad_t2_flink484
{
	private void notifyNewInstance(Instance instance) {
		synchronized (this.instanceListeners) {
			for (InstanceListener listener : this.instanceListeners) {
				try {
					listener.newInstanceAvailable(instance);
				}
				catch (Throwable t) {
					LOG.error("Notification of new instance availability failed.", t);
				}
			}
		}
	}
}