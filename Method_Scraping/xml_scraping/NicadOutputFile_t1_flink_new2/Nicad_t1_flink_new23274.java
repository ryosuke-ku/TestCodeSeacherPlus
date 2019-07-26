// clone pairs:18482:90%
// 25648:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/job/SubtaskExecutionAttemptDetailsInfo.java

public class Nicad_t1_flink_new23274
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		SubtaskExecutionAttemptDetailsInfo that = (SubtaskExecutionAttemptDetailsInfo) o;

		return subtaskIndex == that.subtaskIndex &&
			status == that.status &&
			attempt == that.attempt &&
			Objects.equals(host, that.host) &&
			startTime == that.startTime &&
			endTime == that.endTime &&
			duration == that.duration &&
			Objects.equals(ioMetricsInfo, that.ioMetricsInfo);
	}
}