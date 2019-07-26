// clone pairs:5549:84%
// 5953:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/CharValueArray.java

public class Nicad_t2_flink133
{
	public boolean equals(Object obj) {
		if (obj instanceof CharValueArray) {
			CharValueArray other = (CharValueArray) obj;

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