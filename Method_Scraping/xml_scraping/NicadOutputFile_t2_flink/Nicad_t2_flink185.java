// clone pairs:6375:100%
// 6507:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/ShortValueArray.java

public class Nicad_t2_flink185
{
	public boolean equals(Object obj) {
		if (obj instanceof ShortValueArray) {
			ShortValueArray other = (ShortValueArray) obj;

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