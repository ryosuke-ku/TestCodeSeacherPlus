// clone pairs:8853:92%
// 9718:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/taskmanager/TaskManagerDetailsInfo.java

public class Nicad_t1_flink_new2341
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}
		TaskManagerDetailsInfo that = (TaskManagerDetailsInfo) o;
		return Objects.equals(taskManagerMetrics, that.taskManagerMetrics);
	}
}