// clone pairs:26276:90%
// 40719:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/job/SubtaskExecutionAttemptDetailsInfo.java

public class Nicad_t2_flink2461
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