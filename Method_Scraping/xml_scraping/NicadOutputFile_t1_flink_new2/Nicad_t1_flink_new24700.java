// clone pairs:21661:80%
// 31693:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexDetailsInfo.java

public class Nicad_t1_flink_new24700
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (null == o || this.getClass() != o.getClass()) {
			return false;
		}

		JobVertexDetailsInfo that = (JobVertexDetailsInfo) o;
		return Objects.equals(id, that.id) &&
			Objects.equals(name, that.name) &&
			parallelism == that.parallelism &&
			now == that.now &&
			Objects.equals(subtasks, that.subtasks);
	}
}