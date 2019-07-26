// clone pairs:24601:90%
// 37115:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/TaskCheckpointStatisticsWithSubtaskDetails.java

public class Nicad_t1_flink_new26002
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			Summary summary = (Summary) o;
			return Objects.equals(stateSize, summary.stateSize) &&
				Objects.equals(duration, summary.duration) &&
				Objects.equals(checkpointDuration, summary.checkpointDuration) &&
				Objects.equals(checkpointAlignment, summary.checkpointAlignment);
		}
}