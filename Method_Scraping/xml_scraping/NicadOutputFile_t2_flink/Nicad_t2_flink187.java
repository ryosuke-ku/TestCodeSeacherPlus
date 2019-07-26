// clone pairs:6377:100%
// 6511:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/DoubleValueArray.java

public class Nicad_t2_flink187
{
	public boolean equals(Object obj) {
		if (obj instanceof DoubleValueArray) {
			DoubleValueArray other = (DoubleValueArray) obj;

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