// clone pairs:16815:90%
// 22534:flink/flink-runtime/src/main/java/org/apache/flink/runtime/scheduler/adapter/DefaultSchedulingResultPartition.java

public class Nicad_t1_flink_new22598
{
	public ResultPartitionState getState() {
		switch (producer.getState()) {
			case RUNNING:
				return PRODUCING;
			case FINISHED:
				return DONE;
			default:
				return EMPTY;
		}
	}
}