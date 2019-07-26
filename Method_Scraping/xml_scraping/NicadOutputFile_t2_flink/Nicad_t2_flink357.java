// clone pairs:9120:100%
// 10259:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/LongValueArray.java

public class Nicad_t2_flink357
{
	public boolean add(LongValue value) {
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