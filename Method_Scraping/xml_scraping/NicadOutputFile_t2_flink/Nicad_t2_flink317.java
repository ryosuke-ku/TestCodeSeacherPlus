// clone pairs:8877:84%
// 9819:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/runtime/tasks/SystemProcessingTimeService.java

public class Nicad_t2_flink317
{
		public void run() {
			synchronized (lock) {
				try {
					if (serviceStatus.get() == STATUS_ALIVE) {
						target.onProcessingTime(timestamp);
					}
				} catch (Throwable t) {
					TimerException asyncException = new TimerException(t);
					exceptionHandler.handleAsyncException("Caught exception while processing timer.", asyncException);
				}
			}
		}
}