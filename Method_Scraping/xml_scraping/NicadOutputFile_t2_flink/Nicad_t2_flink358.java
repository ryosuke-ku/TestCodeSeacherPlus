// clone pairs:9123:100%
// 10262:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/FloatValueArray.java

public class Nicad_t2_flink358
{
	public boolean add(FloatValue value) {
		int newPosition = position + 1;

		if (newPosition > data.length) {
			if (isBounded) {
				return false;
			} else {
				ensureCapacity(newPosition);
			}
		}

		data[position] = value.getValue();
		position = newPosition;

		return true;
	}
}