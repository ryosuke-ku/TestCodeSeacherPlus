// clone pairs:7046:80%
// 7198:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/runtime/tasks/SystemProcessingTimeService.java

public class Nicad_t2_flink267
{
	public ScheduledFuture<?> registerTimer(long timestamp, ProcessingTimeCallback target) {

		// delay the firing of the timer by 1 ms to align the semantics with watermark. A watermark
		// T says we won't see elements in the future with a timestamp smaller or equal to T.
		// With processing time, we therefore need to delay firing the timer by one ms.
		long delay = Math.max(timestamp - getCurrentProcessingTime(), 0) + 1;

		// we directly try to register the timer and only react to the status on exception
		// that way we save unnecessary volatile accesses for each timer
		try {
			return timerService.schedule(
					new TriggerTask(status, task, checkpointLock, target, timestamp), delay, TimeUnit.MILLISECONDS);
		}
		catch (RejectedExecutionException e) {
			final int status = this.status.get();
			if (status == STATUS_QUIESCED) {
				return new NeverCompleteFuture(delay);
			}
			else if (status == STATUS_SHUTDOWN) {
				throw new IllegalStateException("Timer service is shut down");
			}
			else {
				// something else happened, so propagate the exception
				throw e;
			}
		}
	}
}