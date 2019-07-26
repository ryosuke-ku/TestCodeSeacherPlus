// clone pairs:9128:100%
// 10272:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/CharValueArray.java

public class Nicad_t2_flink363
{
	public boolean add(CharValue value) {
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