// clone pairs:26374:80%
// 40911:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointingStatistics.java

public class Nicad_t2_flink2497
{
	public CheckpointingStatistics(
			@JsonProperty(FIELD_NAME_COUNTS) Counts counts,
			@JsonProperty(FIELD_NAME_SUMMARY) Summary summary,
			@JsonProperty(FIELD_NAME_LATEST_CHECKPOINTS) LatestCheckpoints latestCheckpoints,
			@JsonProperty(FIELD_NAME_HISTORY) List<CheckpointStatistics> history) {
		this.counts = Preconditions.checkNotNull(counts);
		this.summary = Preconditions.checkNotNull(summary);
		this.latestCheckpoints = Preconditions.checkNotNull(latestCheckpoints);
		this.history = Preconditions.checkNotNull(history);
	}
}