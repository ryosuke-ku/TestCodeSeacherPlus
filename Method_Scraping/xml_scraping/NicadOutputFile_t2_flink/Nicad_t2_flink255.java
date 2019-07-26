// clone pairs:6920:100%
// 7064:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/LongValueArray.java

public class Nicad_t2_flink255
{
	public boolean addAll(ValueArray<LongValue> other) {
		LongValueArray source = (LongValueArray) other;

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