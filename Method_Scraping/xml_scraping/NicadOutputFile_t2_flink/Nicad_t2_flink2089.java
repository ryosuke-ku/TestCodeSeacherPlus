// clone pairs:25438:70%
// 39067:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobExceptionsInfo.java

public class Nicad_t2_flink2089
{
	public JobExceptionsInfo(
		@JsonProperty(FIELD_NAME_ROOT_EXCEPTION) String rootException,
		@JsonProperty(FIELD_NAME_TIMESTAMP) Long rootTimestamp,
		@JsonProperty(FIELD_NAME_ALL_EXCEPTIONS) List<ExecutionExceptionInfo> allExceptions,
		@JsonProperty(FIELD_NAME_TRUNCATED) boolean truncated) {
		this.rootException = rootException;
		this.rootTimestamp = rootTimestamp;
		this.allExceptions = Preconditions.checkNotNull(allExceptions);
		this.truncated = truncated;
	}
}