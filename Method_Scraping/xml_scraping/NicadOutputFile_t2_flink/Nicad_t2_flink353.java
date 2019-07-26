// clone pairs:9116:100%
// 10251:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/IntValueArray.java

public class Nicad_t2_flink353
{
	public boolean add(IntValue value) {
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