// clone pairs:11449:90%
// 13045:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexTaskManagersInfo.java

public class Nicad_t2_flink640
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			TaskManagersInfo that = (TaskManagersInfo) o;
			return Objects.equals(host, that.host) &&
				Objects.equals(status, that.status) &&
				startTime == that.startTime &&
				endTime == that.endTime &&
				duration == that.duration &&
				Objects.equals(metrics, that.metrics) &&
				Objects.equals(statusCounts, that.statusCounts);
		}
}