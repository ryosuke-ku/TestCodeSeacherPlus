// clone pairs:10050:91%
// 10958:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/DoubleValueArray.java

public class Nicad_t2_flink423
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