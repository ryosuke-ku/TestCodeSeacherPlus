// clone pairs:25353:90%
// 38601:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexBackPressureInfo.java

public class Nicad_t1_flink_new26333
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			SubtaskBackPressureInfo that = (SubtaskBackPressureInfo) o;
			return subtask == that.subtask &&
				ratio == that.ratio &&
				Objects.equals(backpressureLevel, that.backpressureLevel);
		}
}