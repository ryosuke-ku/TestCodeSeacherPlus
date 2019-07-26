// clone pairs:8098:76%
// 8234:flink/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/CheckpointProperties.java

public class Nicad_t1_flink_new2180
{
	public static CheckpointProperties forCheckpoint(CheckpointRetentionPolicy policy) {
		switch (policy) {
			case NEVER_RETAIN_AFTER_TERMINATION:
				return CHECKPOINT_NEVER_RETAINED;
			case RETAIN_ON_FAILURE:
				return CHECKPOINT_RETAINED_ON_FAILURE;
			case RETAIN_ON_CANCELLATION:
				return CHECKPOINT_RETAINED_ON_CANCELLATION;
			default:
				throw new IllegalArgumentException("unknown policy: " + policy);
		}
	}
}