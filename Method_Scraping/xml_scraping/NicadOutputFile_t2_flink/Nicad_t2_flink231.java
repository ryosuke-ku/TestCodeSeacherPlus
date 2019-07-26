// clone pairs:6737:100%
// 6834:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/DoubleValueArray.java

public class Nicad_t2_flink231
{
	public boolean addAll(ValueArray<DoubleValue> other) {
		DoubleValueArray source = (DoubleValueArray) other;

		int sourceSize = source.position;
		int newPosition = position + sourceSize;

		if (newPosition > data.length) {
			if (isBounded) {
				return false;
			} else {
				ensureCapacity(newPosition);
			}
		}

		System.arraycopy(source.data, 0, data, position, sourceSize);
		position = newPosition;

		return true;
	}
}