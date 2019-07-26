// clone pairs:26261:90%
// 40689:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/TaskCheckpointStatisticsWithSubtaskDetails.java

public class Nicad_t2_flink2452
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