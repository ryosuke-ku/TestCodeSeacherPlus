// clone pairs:9683:100%
// 10502:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/functions/source/FromElementsFunction.java

public class Nicad_t1_flink_new2425
{
	public void initializeState(FunctionInitializationContext context) throws Exception {
		Preconditions.checkState(this.checkpointedState == null,
			"The " + getClass().getSimpleName() + " has already been initialized.");

		this.checkpointedState = context.getOperatorStateStore().getListState(
			new ListStateDescriptor<>(
				"from-elements-state",
				IntSerializer.INSTANCE
			)
		);

		if (context.isRestored()) {
			List<Integer> retrievedStates = new ArrayList<>();
			for (Integer entry : this.checkpointedState.get()) {
				retrievedStates.add(entry);
			}

			// given that the parallelism of the function is 1, we can only have 1 state
			Preconditions.checkArgument(retrievedStates.size() == 1,
				getClass().getSimpleName() + " retrieved invalid state.");

			this.numElementsToSkip = retrievedStates.get(0);
		}
	}
}