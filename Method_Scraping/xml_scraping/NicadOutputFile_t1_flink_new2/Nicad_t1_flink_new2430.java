// clone pairs:9785:75%
// 10640:flink/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/StateAssignmentOperation.java

public class Nicad_t1_flink_new2430
{
	public static List<KeyedStateHandle> getKeyedStateHandles(
		Collection<? extends KeyedStateHandle> keyedStateHandles,
		KeyGroupRange subtaskKeyGroupRange) {

		List<KeyedStateHandle> subtaskKeyedStateHandles = new ArrayList<>(keyedStateHandles.size());

		for (KeyedStateHandle keyedStateHandle : keyedStateHandles) {
			KeyedStateHandle intersectedKeyedStateHandle = keyedStateHandle.getIntersection(subtaskKeyGroupRange);

			if (intersectedKeyedStateHandle != null) {
				subtaskKeyedStateHandles.add(intersectedKeyedStateHandle);
			}
		}

		return subtaskKeyedStateHandles;
	}
}