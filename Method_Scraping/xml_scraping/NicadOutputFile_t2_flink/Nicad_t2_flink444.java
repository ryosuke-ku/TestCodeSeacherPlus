// clone pairs:10072:100%
// 11001:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/IntValueArray.java

public class Nicad_t2_flink444
{
	public int compareTo(ValueArray<IntValue> o) {
		IntValueArray other = (IntValueArray) o;

		int min = Math.min(position, other.position);
		for (int i = 0; i < min; i++) {
			int cmp = Integer.compare(data[i], other.data[i]);

			if (cmp != 0) {
				return cmp;
			}
		}

		return Integer.compare(position, other.position);
	}
}