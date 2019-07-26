// clone pairs:21777:100%
// 31921:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexBackPressureInfo.java

public class Nicad_t1_flink_new24758
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