// clone pairs:6526:93%
// 6627:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/ShortValueArray.java

public class Nicad_t2_flink199
{
	public boolean addAll(ValueArray<ShortValue> other) {
		ShortValueArray source = (ShortValueArray) other;

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