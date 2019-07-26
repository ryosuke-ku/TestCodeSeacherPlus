// clone pairs:6673:81%
// 6722:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/runtime/operators/windowing/WindowOperator.java

public class Nicad_t1_flink_new2101
{
		public <S extends MergingState<?, ?>> void mergePartitionedState(StateDescriptor<S, ?> stateDescriptor) {
			if (mergedWindows != null && mergedWindows.size() > 0) {
				try {
					S rawState = getKeyedStateBackend().getOrCreateKeyedState(windowSerializer, stateDescriptor);

					if (rawState instanceof InternalMergingState) {
						@SuppressWarnings("unchecked")
						InternalMergingState<K, W, ?, ?, ?> mergingState = (InternalMergingState<K, W, ?, ?, ?>) rawState;
						mergingState.mergeNamespaces(window, mergedWindows);
					}
					else {
						throw new IllegalArgumentException(
								"The given state descriptor does not refer to a mergeable state (MergingState)");
					}
				}
				catch (Exception e) {
					throw new RuntimeException("Error while merging state.", e);
				}
			}
		}
}