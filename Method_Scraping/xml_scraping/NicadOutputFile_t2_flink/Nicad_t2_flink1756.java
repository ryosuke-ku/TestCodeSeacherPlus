// clone pairs:24817:80%
// 37841:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/SubtasksTimesInfo.java

public class Nicad_t2_flink1756
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