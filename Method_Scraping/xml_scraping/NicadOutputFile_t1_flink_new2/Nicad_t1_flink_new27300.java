// clone pairs:27306:90%
// 42440:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointingStatistics.java

public class Nicad_t1_flink_new27300
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			LatestCheckpoints that = (LatestCheckpoints) o;
			return Objects.equals(completedCheckpointStatistics, that.completedCheckpointStatistics) &&
				Objects.equals(savepointStatistics, that.savepointStatistics) &&
				Objects.equals(failedCheckpointStatistics, that.failedCheckpointStatistics) &&
				Objects.equals(restoredCheckpointStatistics, that.restoredCheckpointStatistics);
		}
}