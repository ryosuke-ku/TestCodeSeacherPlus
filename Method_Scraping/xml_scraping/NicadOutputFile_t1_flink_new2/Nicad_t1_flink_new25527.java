// clone pairs:23683:70%
// 35299:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/taskmanager/TaskManagerInfo.java

public class Nicad_t1_flink_new25527
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TaskManagerInfo that = (TaskManagerInfo) o;
		return dataPort == that.dataPort &&
			lastHeartbeat == that.lastHeartbeat &&
			numberSlots == that.numberSlots &&
			numberAvailableSlots == that.numberAvailableSlots &&
			Objects.equals(resourceId, that.resourceId) &&
			Objects.equals(address, that.address) &&
			Objects.equals(hardwareDescription, that.hardwareDescription);
	}
}