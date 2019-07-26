// clone pairs:7702:78%
// 7568:flink/flink-runtime/src/main/java/org/apache/flink/runtime/operators/shipping/OutputEmitter.java

public class Nicad_t1_flink_new2130
{
	private final int compareRecordAndBoundary(T record, Object[] boundary) {
		this.comparator.extractKeys(record, keys, 0);

		if (flatComparators.length != keys.length || flatComparators.length > boundary.length) {
			throw new RuntimeException("Can not compare keys with boundary due to mismatched length.");
		}

		for (int i = 0; i < flatComparators.length; i++) {
			int result = flatComparators[i].compare(keys[i], boundary[i]);
			if (result != 0) {
				return result;
			}
		}
		return 0;
	}
}