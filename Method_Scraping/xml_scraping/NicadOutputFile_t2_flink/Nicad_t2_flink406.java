// clone pairs:10033:100%
// 10924:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/ShortValueArray.java

public class Nicad_t2_flink406
{
	public int compareTo(ValueArray<ShortValue> o) {
		ShortValueArray other = (ShortValueArray) o;

		int min = Math.min(position, other.position);
		for (int i = 0; i < min; i++) {
			int cmp = Short.compare(data[i], other.data[i]);

			if (cmp != 0) {
				return cmp;
			}
		}

		return Integer.compare(position, other.position);
	}
}