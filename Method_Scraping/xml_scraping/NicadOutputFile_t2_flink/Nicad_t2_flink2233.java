// clone pairs:25726:80%
// 39635:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobExceptionsInfo.java

public class Nicad_t2_flink2233
{
		public ExecutionExceptionInfo(
			@JsonProperty(FIELD_NAME_EXCEPTION) String exception,
			@JsonProperty(FIELD_NAME_TASK) String task,
			@JsonProperty(FIELD_NAME_LOCATION) String location,
			@JsonProperty(FIELD_NAME_TIMESTAMP) long timestamp) {
			this.exception = Preconditions.checkNotNull(exception);
			this.task = Preconditions.checkNotNull(task);
			this.location = Preconditions.checkNotNull(location);
			this.timestamp = timestamp;
		}
}