// clone pairs:20709:90%
// 29999:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointingStatistics.java

public class Nicad_t1_flink_new24329
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CheckpointingStatistics that = (CheckpointingStatistics) o;
		return Objects.equals(counts, that.counts) &&
			Objects.equals(summary, that.summary) &&
			Objects.equals(latestCheckpoints, that.latestCheckpoints) &&
			Objects.equals(history, that.history);
	}
}