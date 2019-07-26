// clone pairs:5683:72%
// 6027:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/TaskCheckpointStatistics.java

public class Nicad_t1_flink_new261
{
	public TaskCheckpointStatistics(
			@JsonProperty(FIELD_NAME_ID) long checkpointId,
			@JsonProperty(FIELD_NAME_CHECKPOINT_STATUS) CheckpointStatsStatus checkpointStatus,
			@JsonProperty(FIELD_NAME_LATEST_ACK_TIMESTAMP) long latestAckTimestamp,
			@JsonProperty(FIELD_NAME_STATE_SIZE) long stateSize,
			@JsonProperty(FIELD_NAME_DURATION) long duration,
			@JsonProperty(FIELD_NAME_ALIGNMENT_BUFFERED) long alignmentBuffered,
			@JsonProperty(FIELD_NAME_NUM_SUBTASKS) int numSubtasks,
			@JsonProperty(FIELD_NAME_NUM_ACK_SUBTASKS) int numAckSubtasks) {

		this.checkpointId = checkpointId;
		this.checkpointStatus = Preconditions.checkNotNull(checkpointStatus);
		this.latestAckTimestamp = latestAckTimestamp;
		this.stateSize = stateSize;
		this.duration = duration;
		this.alignmentBuffered = alignmentBuffered;
		this.numSubtasks = numSubtasks;
		this.numAckSubtasks = numAckSubtasks;
	}
}