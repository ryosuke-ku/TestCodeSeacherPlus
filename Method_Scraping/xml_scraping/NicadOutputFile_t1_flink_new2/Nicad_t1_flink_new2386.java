// clone pairs:9143:75%
// 10244:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointingStatistics.java

public class Nicad_t1_flink_new2386
{
		public Counts(
				@JsonProperty(FIELD_NAME_RESTORED_CHECKPOINTS) long numberRestoredCheckpoints,
				@JsonProperty(FIELD_NAME_TOTAL_CHECKPOINTS) long totalNumberCheckpoints,
				@JsonProperty(FIELD_NAME_IN_PROGRESS_CHECKPOINTS) int numberInProgressCheckpoints,
				@JsonProperty(FIELD_NAME_COMPLETED_CHECKPOINTS) long numberCompletedCheckpoints,
				@JsonProperty(FIELD_NAME_FAILED_CHECKPOINTS) long numberFailedCheckpoints) {
			this.numberRestoredCheckpoints = numberRestoredCheckpoints;
			this.totalNumberCheckpoints = totalNumberCheckpoints;
			this.numberInProgressCheckpoints = numberInProgressCheckpoints;
			this.numberCompletedCheckpoints = numberCompletedCheckpoints;
			this.numberFailedCheckpoints = numberFailedCheckpoints;
		}
}