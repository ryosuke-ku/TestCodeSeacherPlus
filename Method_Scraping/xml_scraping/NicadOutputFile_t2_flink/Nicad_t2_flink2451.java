// clone pairs:26260:90%
// 40687:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/TaskCheckpointStatisticsWithSubtaskDetails.java

public class Nicad_t2_flink2451
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