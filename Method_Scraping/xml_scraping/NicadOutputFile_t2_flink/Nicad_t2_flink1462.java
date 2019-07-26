// clone pairs:23375:80%
// 34989:flink/flink-runtime/src/main/java/org/apache/flink/runtime/taskmanager/TaskManagerLocation.java

public class Nicad_t2_flink1462
{
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		else if (obj != null && obj.getClass() == TaskManagerLocation.class) {
			TaskManagerLocation that = (TaskManagerLocation) obj;
			return this.resourceID.equals(that.resourceID) &&
					this.inetAddress.equals(that.inetAddress) &&
					this.dataPort == that.dataPort;
		}
		else {
			return false;
		}
	}
}