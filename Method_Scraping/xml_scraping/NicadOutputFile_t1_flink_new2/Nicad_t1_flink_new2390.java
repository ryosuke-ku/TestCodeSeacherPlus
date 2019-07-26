// clone pairs:9158:75%
// 10270:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/TaskStateManagerImpl.java

public class Nicad_t1_flink_new2390
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