// clone pairs:15680:90%
// 20315:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/job/SubtaskExecutionAttemptAccumulatorsInfo.java

public class Nicad_t1_flink_new22087
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SubtaskExecutionAttemptAccumulatorsInfo that = (SubtaskExecutionAttemptAccumulatorsInfo) o;
		return subtaskIndex == that.subtaskIndex &&
			attemptNum == that.attemptNum &&
			Objects.equals(id, that.id) &&
			Objects.equals(userAccumulatorList, that.userAccumulatorList);
	}
}