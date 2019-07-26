// clone pairs:10035:100%
// 10928:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/LongValueArray.java

public class Nicad_t2_flink408
{
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int idx = 0; idx < this.position; idx++) {
			sb.append(data[idx]);
			if (idx < position - 1) {
				sb.append(",");
			}
		}
		sb.append("]");

		return sb.toString();
	}
}