// clone pairs:26356:90%
// 40577:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/job/SubtaskExecutionAttemptAccumulatorsInfo.java

public class Nicad_t1_flink_new26828
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