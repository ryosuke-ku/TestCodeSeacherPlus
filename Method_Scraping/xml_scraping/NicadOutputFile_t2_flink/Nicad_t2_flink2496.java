// clone pairs:26373:70%
// 40909:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/TaskCheckpointStatisticsWithSubtaskDetails.java

public class Nicad_t2_flink2496
{
		public Summary(
				@JsonProperty(FIELD_NAME_STATE_SIZE) MinMaxAvgStatistics stateSize,
				@JsonProperty(FIELD_NAME_DURATION) MinMaxAvgStatistics duration,
				@JsonProperty(FIELD_NAME_CHECKPOINT_DURATION) CheckpointDuration checkpointDuration,
				@JsonProperty(FIELD_NAME_ALIGNMENT) CheckpointAlignment checkpointAlignment) {
			this.stateSize = Preconditions.checkNotNull(stateSize);
			this.duration = Preconditions.checkNotNull(duration);
			this.checkpointDuration = Preconditions.checkNotNull(checkpointDuration);
			this.checkpointAlignment = Preconditions.checkNotNull(checkpointAlignment);
		}
}