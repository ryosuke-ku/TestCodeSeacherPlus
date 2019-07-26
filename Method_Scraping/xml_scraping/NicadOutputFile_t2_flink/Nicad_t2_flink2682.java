// clone pairs:27246:90%
// 42621:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointingStatistics.java

public class Nicad_t2_flink2682
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