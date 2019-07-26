// clone pairs:24845:80%
// 37897:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/TaskCheckpointStatisticsWithSubtaskDetails.java

public class Nicad_t2_flink1781
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