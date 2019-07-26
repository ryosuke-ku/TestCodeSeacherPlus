// clone pairs:10069:100%
// 10995:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/FloatValueArray.java

public class Nicad_t2_flink441
{
	public int compareTo(ValueArray<FloatValue> o) {
		FloatValueArray other = (FloatValueArray) o;

		int min = Math.min(position, other.position);
		for (int i = 0; i < min; i++) {
			int cmp = Float.compare(data[i], other.data[i]);

			if (cmp != 0) {
				return cmp;
			}
		}

		return Integer.compare(position, other.position);
	}
}