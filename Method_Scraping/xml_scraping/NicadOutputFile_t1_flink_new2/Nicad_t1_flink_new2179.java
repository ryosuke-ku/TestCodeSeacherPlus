// clone pairs:8094:76%
// 8231:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/TaskStateManagerImpl.java

public class Nicad_t1_flink_new2179
{
	public TaskStateManagerImpl(
		@Nonnull JobID jobId,
		@Nonnull ExecutionAttemptID executionAttemptID,
		@Nonnull TaskLocalStateStore localStateStore,
		@Nullable JobManagerTaskRestore jobManagerTaskRestore,
		@Nonnull CheckpointResponder checkpointResponder) {

		this.jobId = jobId;
		this.localStateStore = localStateStore;
		this.jobManagerTaskRestore = jobManagerTaskRestore;
		this.executionAttemptID = executionAttemptID;
		this.checkpointResponder = checkpointResponder;
	}
}