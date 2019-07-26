// clone pairs:10119:72%
// 11089:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/operators/OperatorSnapshotFutures.java

public class Nicad_t2_flink474
{
	public OperatorSnapshotFutures(
		@Nonnull RunnableFuture<SnapshotResult<KeyedStateHandle>> keyedStateManagedFuture,
		@Nonnull RunnableFuture<SnapshotResult<KeyedStateHandle>> keyedStateRawFuture,
		@Nonnull RunnableFuture<SnapshotResult<OperatorStateHandle>> operatorStateManagedFuture,
		@Nonnull RunnableFuture<SnapshotResult<OperatorStateHandle>> operatorStateRawFuture) {
		this.keyedStateManagedFuture = keyedStateManagedFuture;
		this.keyedStateRawFuture = keyedStateRawFuture;
		this.operatorStateManagedFuture = operatorStateManagedFuture;
		this.operatorStateRawFuture = operatorStateRawFuture;
	}
}