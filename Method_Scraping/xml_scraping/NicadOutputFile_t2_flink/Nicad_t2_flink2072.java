// clone pairs:25388:90%
// 38969:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexBackPressureInfo.java

public class Nicad_t2_flink2072
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JobVertexBackPressureInfo that = (JobVertexBackPressureInfo) o;
		return Objects.equals(status, that.status) &&
			Objects.equals(backpressureLevel, that.backpressureLevel) &&
			Objects.equals(endTimestamp, that.endTimestamp) &&
			Objects.equals(subtasks, that.subtasks);
	}
}