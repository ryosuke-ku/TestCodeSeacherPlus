// clone pairs:9775:83%
// 10675:flink/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/CheckpointStatsTracker.java

public class Nicad_t2_flink388
{
	private void reportCompletedCheckpoint(CompletedCheckpointStats completed) {
		statsReadWriteLock.lock();
		try {
			latestCompletedCheckpoint = completed;

			counts.incrementCompletedCheckpoints();
			history.replacePendingCheckpointById(completed);

			summary.updateSummary(completed);

			dirty = true;
		} finally {
			statsReadWriteLock.unlock();
		}
	}
}