// clone pairs:6978:100%
// 7120:flink/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/StateAssignmentOperation.java

public class Nicad_t2_flink261
{
	public static List<KeyedStateHandle> getManagedKeyedStateHandles(
		OperatorState operatorState,
		KeyGroupRange subtaskKeyGroupRange) {

		final int parallelism = operatorState.getParallelism();

		List<KeyedStateHandle> subtaskKeyedStateHandles = null;

		for (int i = 0; i < parallelism; i++) {
			if (operatorState.getState(i) != null) {

				Collection<KeyedStateHandle> keyedStateHandles = operatorState.getState(i).getManagedKeyedState();

				if (subtaskKeyedStateHandles == null) {
					subtaskKeyedStateHandles = new ArrayList<>(parallelism * keyedStateHandles.size());
				}

				extractIntersectingState(
					keyedStateHandles,
					subtaskKeyGroupRange,
					subtaskKeyedStateHandles);
			}
		}

		return subtaskKeyedStateHandles;
	}
}