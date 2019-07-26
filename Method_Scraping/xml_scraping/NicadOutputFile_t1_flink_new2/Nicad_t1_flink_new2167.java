// clone pairs:7954:76%
// 8013:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/TaskCheckpointStatisticsWithSubtaskDetails.java

public class Nicad_t1_flink_new2167
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