// clone pairs:22335:80%
// 32998:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexDetailsInfo.java

public class Nicad_t1_flink_new25015
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