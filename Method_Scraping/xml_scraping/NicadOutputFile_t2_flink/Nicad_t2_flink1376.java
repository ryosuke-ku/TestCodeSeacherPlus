// clone pairs:22014:80%
// 32672:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/job/SubtasksAllAccumulatorsInfo.java

public class Nicad_t2_flink1376
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