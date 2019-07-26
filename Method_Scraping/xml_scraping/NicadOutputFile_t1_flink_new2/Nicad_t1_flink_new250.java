// clone pairs:5419:75%
// 5825:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/TaskLocalStateStoreImpl.java

public class Nicad_t1_flink_new250
{
	TaskLocalStateStoreImpl(
		@Nonnull JobID jobID,
		@Nonnull AllocationID allocationID,
		@Nonnull JobVertexID jobVertexID,
		@Nonnegative int subtaskIndex,
		@Nonnull LocalRecoveryConfig localRecoveryConfig,
		@Nonnull Executor discardExecutor,
		@Nonnull SortedMap<Long, TaskStateSnapshot> storedTaskStateByCheckpointID,
		@Nonnull Object lock) {

		this.jobID = jobID;
		this.allocationID = allocationID;
		this.jobVertexID = jobVertexID;
		this.subtaskIndex = subtaskIndex;
		this.discardExecutor = discardExecutor;
		this.localRecoveryConfig = localRecoveryConfig;
		this.storedTaskStateByCheckpointID = storedTaskStateByCheckpointID;
		this.lock = lock;
		this.disposed = false;
	}
}