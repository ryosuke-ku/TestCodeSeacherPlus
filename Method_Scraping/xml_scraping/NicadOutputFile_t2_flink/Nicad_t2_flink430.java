// clone pairs:10057:100%
// 10972:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/LongValueArray.java

public class Nicad_t2_flink430
{
	public int compareTo(ValueArray<LongValue> o) {
		LongValueArray other = (LongValueArray) o;

		int min = Math.min(position, other.position);
		for (int i = 0; i < min; i++) {
			int cmp = Long.compare(data[i], other.data[i]);

			if (cmp != 0) {
				return cmp;
			}
		}

		return Integer.compare(position, other.position);
	}
}