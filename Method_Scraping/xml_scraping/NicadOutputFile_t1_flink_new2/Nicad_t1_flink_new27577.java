// clone pairs:27885:70%
// 43567:flink/flink-runtime/src/main/java/org/apache/flink/runtime/io/network/api/CheckpointBarrier.java

public class Nicad_t1_flink_new27577
{
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		else if (other == null || other.getClass() != CheckpointBarrier.class) {
			return false;
		}
		else {
			CheckpointBarrier that = (CheckpointBarrier) other;
			return that.id == this.id && that.timestamp == this.timestamp &&
					this.checkpointOptions.equals(that.checkpointOptions);
		}
	}
}