// clone pairs:8930:84%
// 9870:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/TaskCheckpointStatisticsWithSubtaskDetails.java

public class Nicad_t1_flink_new2363
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}
		TaskCheckpointStatisticsWithSubtaskDetails that = (TaskCheckpointStatisticsWithSubtaskDetails) o;
		return Objects.equals(summary, that.summary) &&
			Objects.equals(subtaskCheckpointStatistics, that.subtaskCheckpointStatistics);
	}
}