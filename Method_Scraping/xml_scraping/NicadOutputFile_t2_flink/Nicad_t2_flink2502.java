// clone pairs:26439:100%
// 41039:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/TaskCheckpointStatisticsWithSubtaskDetails.java

public class Nicad_t2_flink2502
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			CheckpointAlignment alignment = (CheckpointAlignment) o;
			return Objects.equals(bufferedData, alignment.bufferedData) &&
				Objects.equals(duration, alignment.duration);
		}
}