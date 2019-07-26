// clone pairs:16817:90%
// 22538:flink/flink-runtime/src/main/java/org/apache/flink/runtime/scheduler/adapter/DefaultSchedulingResultPartition.java

public class Nicad_t1_flink_new22599
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