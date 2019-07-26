// clone pairs:10324:81%
// 11392:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/heap/KeyGroupPartitionedPriorityQueue.java

public class Nicad_t2_flink522
{
	public boolean add(@Nonnull T toAdd) {
		final PQ list = getKeyGroupSubHeapForElement(toAdd);

		// the branch checks if the head element has (potentially) changed.
		if (list.add(toAdd)) {
			heapOfKeyGroupedHeaps.adjustModifiedElement(list);
			// could we have a new head?
			return toAdd.equals(peek());
		} else {
			// head unchanged
			return false;
		}
	}
}