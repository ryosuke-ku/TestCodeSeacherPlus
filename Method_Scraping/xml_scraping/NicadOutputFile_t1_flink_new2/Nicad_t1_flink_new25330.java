// clone pairs:23283:80%
// 34508:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/SubtasksTimesInfo.java

public class Nicad_t1_flink_new25330
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