// clone pairs:26945:90%
// 41733:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/TaskCheckpointStatistics.java

public class Nicad_t1_flink_new27152
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TaskCheckpointStatistics that = (TaskCheckpointStatistics) o;
		return checkpointId == that.checkpointId &&
			latestAckTimestamp == that.latestAckTimestamp &&
			stateSize == that.stateSize &&
			duration == that.duration &&
			alignmentBuffered == that.alignmentBuffered &&
			numSubtasks == that.numSubtasks &&
			numAckSubtasks == that.numAckSubtasks &&
			checkpointStatus == that.checkpointStatus;
	}
}