// clone pairs:16789:90%
// 22485:flink/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/TaskStateSnapshot.java

public class Nicad_t1_flink_new22592
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		TaskStateSnapshot that = (TaskStateSnapshot) o;

		return subtaskStatesByOperatorID.equals(that.subtaskStatesByOperatorID);
	}
}