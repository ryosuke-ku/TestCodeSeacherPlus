// clone pairs:20670:80%
// 29921:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexDetailsInfo.java

public class Nicad_t1_flink_new24299
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}

			if (null == o || this.getClass() != o.getClass()) {
				return false;
			}

			VertexTaskDetail that = (VertexTaskDetail) o;
			return subtask == that.subtask &&
				Objects.equals(status, that.status) &&
				attempt == that.attempt &&
				Objects.equals(host, that.host) &&
				startTime == that.startTime &&
				startTimeCompatible == that.startTimeCompatible &&
				endTime == that.endTime &&
				duration == that.duration &&
				Objects.equals(metrics, that.metrics);
		}
}