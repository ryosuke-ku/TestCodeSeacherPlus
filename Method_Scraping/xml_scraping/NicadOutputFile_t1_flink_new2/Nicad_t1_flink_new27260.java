// clone pairs:27220:80%
// 42272:flink/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/StateObjectCollection.java

public class Nicad_t1_flink_new27260
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		StateObjectCollection<?> that = (StateObjectCollection<?>) o;

		// simple equals can cause troubles here because of how equals works e.g. between lists and sets.
		return CollectionUtils.isEqualCollection(stateObjects, that.stateObjects);
	}
}