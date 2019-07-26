// clone pairs:7544:71%
// 7449:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/runtime/window/WindowOperator.java

public class Nicad_t1_flink_new2124
{
		public <S extends MergingState<?, ?>> void mergePartitionedState(
				StateDescriptor<S, ?> stateDescriptor) {
			if (mergedWindows != null && mergedWindows.size() > 0) {
				try {
					State state =
							WindowOperator.this.getOrCreateKeyedState(
									windowSerializer,
									stateDescriptor);
					if (state instanceof InternalMergingState) {
						((InternalMergingState<K, W, ?, ?, ?>) state).mergeNamespaces(window, mergedWindows);
					} else {
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