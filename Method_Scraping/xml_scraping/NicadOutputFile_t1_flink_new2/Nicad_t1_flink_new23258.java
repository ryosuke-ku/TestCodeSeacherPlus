// clone pairs:18465:90%
// 25614:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexTaskManagersInfo.java

public class Nicad_t1_flink_new23258
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