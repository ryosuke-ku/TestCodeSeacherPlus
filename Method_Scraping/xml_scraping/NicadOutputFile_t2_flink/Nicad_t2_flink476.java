// clone pairs:10125:72%
// 11101:flink/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/SubtaskStateStats.java

public class Nicad_t2_flink476
{
	SubtaskStateStats(
			int subtaskIndex,
			long ackTimestamp,
			long stateSize,
			long syncCheckpointDuration,
			long asyncCheckpointDuration,
			long alignmentBuffered,
			long alignmentDuration) {

		checkArgument(subtaskIndex >= 0, "Negative subtask index");
		this.subtaskIndex = subtaskIndex;
		checkArgument(stateSize >= 0, "Negative state size");
		this.stateSize = stateSize;
		this.ackTimestamp = ackTimestamp;
		this.syncCheckpointDuration = syncCheckpointDuration;
		this.asyncCheckpointDuration = asyncCheckpointDuration;
		this.alignmentBuffered = alignmentBuffered;
		this.alignmentDuration = alignmentDuration;
	}
}