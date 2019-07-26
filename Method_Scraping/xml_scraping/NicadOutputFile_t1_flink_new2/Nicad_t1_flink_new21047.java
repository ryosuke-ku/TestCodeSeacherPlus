// clone pairs:12842:70%
// 15085:flink/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/CheckpointOptions.java

public class Nicad_t1_flink_new21047
{
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		else if (obj != null && obj.getClass() == CheckpointOptions.class) {
			final CheckpointOptions that = (CheckpointOptions) obj;
			return this.checkpointType == that.checkpointType &&
					this.targetLocation.equals(that.targetLocation);
		}
		else {
			return false;
		}
	}
}