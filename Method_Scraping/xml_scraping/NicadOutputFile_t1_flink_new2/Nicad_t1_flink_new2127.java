// clone pairs:7603:71%
// 7511:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointConfigInfo.java

public class Nicad_t1_flink_new2127
{
	public CheckpointConfigInfo(
			@JsonProperty(FIELD_NAME_PROCESSING_MODE) ProcessingMode processingMode,
			@JsonProperty(FIELD_NAME_CHECKPOINT_INTERVAL) long checkpointInterval,
			@JsonProperty(FIELD_NAME_CHECKPOINT_TIMEOUT) long checkpointTimeout,
			@JsonProperty(FIELD_NAME_CHECKPOINT_MIN_PAUSE) long minPauseBetweenCheckpoints,
			@JsonProperty(FIELD_NAME_CHECKPOINT_MAX_CONCURRENT) int maxConcurrentCheckpoints,
			@JsonProperty(FIELD_NAME_EXTERNALIZED_CHECKPOINT_CONFIG) ExternalizedCheckpointInfo externalizedCheckpointInfo) {
		this.processingMode = Preconditions.checkNotNull(processingMode);
		this.checkpointInterval = checkpointInterval;
		this.checkpointTimeout = checkpointTimeout;
		this.minPauseBetweenCheckpoints = minPauseBetweenCheckpoints;
		this.maxConcurrentCheckpoints = maxConcurrentCheckpoints;
		this.externalizedCheckpointInfo = Preconditions.checkNotNull(externalizedCheckpointInfo);
	}
}