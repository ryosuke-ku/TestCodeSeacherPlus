// clone pairs:11507:90%
// 13161:flink/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/CheckpointProperties.java

public class Nicad_t2_flink680
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		CheckpointProperties that = (CheckpointProperties) o;
		return forced == that.forced &&
				checkpointType == that.checkpointType &&
				discardSubsumed == that.discardSubsumed &&
				discardFinished == that.discardFinished &&
				discardCancelled == that.discardCancelled &&
				discardFailed == that.discardFailed &&
				discardSuspended == that.discardSuspended;
	}
}