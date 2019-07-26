// clone pairs:24933:80%
// 37772:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/SubtasksTimesInfo.java

public class Nicad_t1_flink_new26141
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}

		SubtasksTimesInfo that = (SubtasksTimesInfo) o;
		return Objects.equals(id, that.id) &&
			Objects.equals(name, that.name) &&
			now == that.now &&
			Objects.equals(subtasks, that.subtasks);
	}
}