// clone pairs:26887:90%
// 41919:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/TaskCheckpointStatisticsWithSubtaskDetails.java

public class Nicad_t2_flink2653
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