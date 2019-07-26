// clone pairs:26189:80%
// 40547:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/job/SubtasksAllAccumulatorsInfo.java

public class Nicad_t2_flink2417
{
		public SubtaskAccumulatorsInfo(
			@JsonProperty(FIELD_NAME_SUBTASK_INDEX) int subtaskIndex,
			@JsonProperty(FIELD_NAME_ATTEMPT_NUM) int attemptNum,
			@JsonProperty(FIELD_NAME_HOST) String host,
			@JsonProperty(FIELD_NAME_USER_ACCUMULATORS) Collection<UserAccumulator> userAccumulators) {

			this.subtaskIndex = subtaskIndex;
			this.attemptNum = attemptNum;
			this.host = Preconditions.checkNotNull(host);
			this.userAccumulators = Preconditions.checkNotNull(userAccumulators);
		}
}