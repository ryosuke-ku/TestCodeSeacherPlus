// clone pairs:11742:80%
// 13524:flink/flink-runtime/src/main/java/org/apache/flink/runtime/concurrent/ScheduledFutureAdapter.java

public class Nicad_t1_flink_new2860
{
	public boolean equals(Object o) {

		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		ScheduledFutureAdapter<?> that = (ScheduledFutureAdapter<?>) o;
		return tieBreakerUid == that.tieBreakerUid && scheduleTimeNanos == that.scheduleTimeNanos;
	}
}