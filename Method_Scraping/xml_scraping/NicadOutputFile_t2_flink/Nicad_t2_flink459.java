// clone pairs:10087:100%
// 11031:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/DoubleValueArray.java

public class Nicad_t2_flink459
{
	private void ensureCapacity(int minCapacity) {
		long currentCapacity = data.length;

		if (minCapacity <= currentCapacity) {
			return;
		}

		// increase capacity by at least ~50%
		long expandedCapacity = Math.max(minCapacity, currentCapacity + (currentCapacity >> 1));
		int newCapacity = (int) Math.min(MAX_ARRAY_SIZE, expandedCapacity);

		if (newCapacity < minCapacity) {
			// throw exception as unbounded arrays are not expected to fill
			throw new RuntimeException("Requested array size " + minCapacity + " exceeds limit of " + MAX_ARRAY_SIZE);
		}

		data = Arrays.copyOf(data, newCapacity);
	}
}