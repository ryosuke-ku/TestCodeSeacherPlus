// clone pairs:5544:84%
// 5943:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/LongValueArray.java

public class Nicad_t2_flink128
{
	public boolean equals(Object obj) {
		if (obj instanceof LongValueArray) {
			LongValueArray other = (LongValueArray) obj;

			if (position != other.position) {
				return false;
			}

			for (int i = 0; i < position; i++) {
				if (data[i] != other.data[i]) {
					return false;
				}
			}

			return true;
		}

		return false;
	}
}