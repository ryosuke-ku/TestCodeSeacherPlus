// clone pairs:25110:80%
// 38421:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexTaskManagersInfo.java

public class Nicad_t2_flink1924
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