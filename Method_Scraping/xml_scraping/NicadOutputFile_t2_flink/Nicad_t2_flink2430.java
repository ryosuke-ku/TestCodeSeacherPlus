// clone pairs:26210:90%
// 40589:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/job/SubtasksAllAccumulatorsInfo.java

public class Nicad_t2_flink2430
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SubtasksAllAccumulatorsInfo that = (SubtasksAllAccumulatorsInfo) o;
		return Objects.equals(jobVertexId, that.jobVertexId) &&
			parallelism == that.parallelism &&
			Objects.equals(subtaskAccumulatorsInfos, that.subtaskAccumulatorsInfos);
	}
}