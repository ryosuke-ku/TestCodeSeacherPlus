// clone pairs:26856:100%
// 41560:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/TaskCheckpointStatisticsWithSubtaskDetails.java

public class Nicad_t1_flink_new27098
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			CheckpointDuration that = (CheckpointDuration) o;
			return Objects.equals(synchronousDuration, that.synchronousDuration) &&
				Objects.equals(asynchronousDuration, that.asynchronousDuration);
		}
}