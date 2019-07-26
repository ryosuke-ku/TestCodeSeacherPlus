// clone pairs:9114:100%
// 10249:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/ShortValueArray.java

public class Nicad_t2_flink352
{
	public boolean add(ShortValue value) {
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