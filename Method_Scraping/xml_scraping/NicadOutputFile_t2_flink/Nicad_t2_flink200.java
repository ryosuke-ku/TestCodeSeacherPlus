// clone pairs:6527:93%
// 6629:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/ByteValueArray.java

public class Nicad_t2_flink200
{
	public boolean addAll(ValueArray<ByteValue> other) {
		ByteValueArray source = (ByteValueArray) other;

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