// clone pairs:13561:90%
// 16288:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointingStatistics.java

public class Nicad_t2_flink803
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