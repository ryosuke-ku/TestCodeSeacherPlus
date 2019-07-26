// clone pairs:19794:80%
// 28212:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexDetailsInfo.java

public class Nicad_t1_flink_new23879
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