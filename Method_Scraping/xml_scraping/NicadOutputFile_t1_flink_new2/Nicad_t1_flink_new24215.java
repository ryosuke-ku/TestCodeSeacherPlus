// clone pairs:20468:90%
// 29529:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointConfigInfo.java

public class Nicad_t1_flink_new24215
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CheckpointConfigInfo that = (CheckpointConfigInfo) o;
		return checkpointInterval == that.checkpointInterval &&
			checkpointTimeout == that.checkpointTimeout &&
			minPauseBetweenCheckpoints == that.minPauseBetweenCheckpoints &&
			maxConcurrentCheckpoints == that.maxConcurrentCheckpoints &&
			processingMode == that.processingMode &&
			Objects.equals(externalizedCheckpointInfo, that.externalizedCheckpointInfo);
	}
}