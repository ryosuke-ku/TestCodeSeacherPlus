// clone pairs:5682:72%
// 6036:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/job/SubtaskExecutionAttemptDetailsInfo.java

public class Nicad_t2_flink145
{
	public SubtaskExecutionAttemptDetailsInfo(
			@JsonProperty(FIELD_NAME_SUBTASK_INDEX) int subtaskIndex,
			@JsonProperty(FIELD_NAME_STATUS) ExecutionState status,
			@JsonProperty(FIELD_NAME_ATTEMPT) int attempt,
			@JsonProperty(FIELD_NAME_HOST) String host,
			@JsonProperty(FIELD_NAME_START_TIME) long startTime,
			@JsonProperty(FIELD_NAME_END_TIME) long endTime,
			@JsonProperty(FIELD_NAME_DURATION) long duration,
			@JsonProperty(FIELD_NAME_METRICS) IOMetricsInfo ioMetricsInfo) {

		this.subtaskIndex = subtaskIndex;
		this.status = Preconditions.checkNotNull(status);
		this.attempt = attempt;
		this.host = Preconditions.checkNotNull(host);
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;
		this.ioMetricsInfo = Preconditions.checkNotNull(ioMetricsInfo);
	}
}