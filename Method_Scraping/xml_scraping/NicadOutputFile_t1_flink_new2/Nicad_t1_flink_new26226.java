// clone pairs:25120:90%
// 38141:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexTaskManagersInfo.java

public class Nicad_t1_flink_new26226
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JobVertexTaskManagersInfo that = (JobVertexTaskManagersInfo) o;
		return Objects.equals(jobVertexID, that.jobVertexID) &&
			Objects.equals(name, that.name) &&
			now == that.now &&
			Objects.equals(taskManagerInfos, that.taskManagerInfos);
	}
}