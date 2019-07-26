// clone pairs:6781:100%
// 6920:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/FloatValueArray.java

public class Nicad_t2_flink235
{
	public boolean addAll(ValueArray<FloatValue> other) {
		FloatValueArray source = (FloatValueArray) other;

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