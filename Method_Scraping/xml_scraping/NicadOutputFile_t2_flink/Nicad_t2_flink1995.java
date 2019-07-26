// clone pairs:25239:80%
// 38675:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexDetailsInfo.java

public class Nicad_t2_flink1995
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