// clone pairs:8149:76%
// 8384:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/TaskCheckpointStatisticsWithSubtaskDetails.java

public class Nicad_t2_flink306
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