// clone pairs:14396:90%
// 17804:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointingStatistics.java

public class Nicad_t1_flink_new21570
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			RestoredCheckpointStatistics that = (RestoredCheckpointStatistics) o;
			return id == that.id &&
				restoreTimestamp == that.restoreTimestamp &&
				savepoint == that.savepoint &&
				Objects.equals(externalPath, that.externalPath);
		}
}