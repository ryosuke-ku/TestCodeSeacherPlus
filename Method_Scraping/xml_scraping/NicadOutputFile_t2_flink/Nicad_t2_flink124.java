// clone pairs:5454:78%
// 5858:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexDetailsInfo.java

public class Nicad_t2_flink124
{
		public VertexTaskDetail(
				@JsonProperty(FIELD_NAME_SUBTASK) int subtask,
				@JsonProperty(FIELD_NAME_STATUS) ExecutionState status,
				@JsonProperty(FIELD_NAME_ATTEMPT) int attempt,
				@JsonProperty(FIELD_NAME_HOST) String host,
				@JsonProperty(FIELD_NAME_START_TIME) long startTime,
				@JsonProperty(FIELD_NAME_END_TIME) long endTime,
				@JsonProperty(FIELD_NAME_DURATION) long duration,
				@JsonProperty(FIELD_NAME_METRICS) IOMetricsInfo metrics) {
			this.subtask = subtask;
			this.status = checkNotNull(status);
			this.attempt = attempt;
			this.host = checkNotNull(host);
			this.startTime = startTime;
			this.startTimeCompatible = startTime;
			this.endTime = endTime;
			this.duration = duration;
			this.metrics = checkNotNull(metrics);
		}
}