// clone pairs:10116:72%
// 11083:flink/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/CheckpointStatsTracker.java

public class Nicad_t2_flink473
{
	void reportRestoredCheckpoint(RestoredCheckpointStats restored) {
		checkNotNull(restored, "Restored checkpoint");

		statsReadWriteLock.lock();
		try {
			counts.incrementRestoredCheckpoints();
			latestRestoredCheckpoint = restored;

			dirty = true;
		} finally {
			statsReadWriteLock.unlock();
		}
	}
}