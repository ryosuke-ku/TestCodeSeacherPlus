// clone pairs:28013:70%
// 44113:flink/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/StateAssignmentOperation.java

public class Nicad_t2_flink2802
{
	private static void extractIntersectingState(
		Collection<KeyedStateHandle> originalSubtaskStateHandles,
		KeyGroupRange rangeToExtract,
		List<KeyedStateHandle> extractedStateCollector) {

		for (KeyedStateHandle keyedStateHandle : originalSubtaskStateHandles) {

			if (keyedStateHandle != null) {

				KeyedStateHandle intersectedKeyedStateHandle = keyedStateHandle.getIntersection(rangeToExtract);

				if (intersectedKeyedStateHandle != null) {
					extractedStateCollector.add(intersectedKeyedStateHandle);
				}
			}
		}
	}
}