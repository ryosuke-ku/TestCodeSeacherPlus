// clone pairs:10081:100%
// 11019:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/DoubleValueArray.java

public class Nicad_t2_flink453
{
	public int compareTo(ValueArray<DoubleValue> o) {
		DoubleValueArray other = (DoubleValueArray) o;

		int min = Math.min(position, other.position);
		for (int i = 0; i < min; i++) {
			int cmp = Double.compare(data[i], other.data[i]);

			if (cmp != 0) {
				return cmp;
			}
		}

		return Integer.compare(position, other.position);
	}
}