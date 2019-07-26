// clone pairs:6539:100%
// 6644:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/IntValueArray.java

public class Nicad_t2_flink201
{
	public boolean equals(Object obj) {
		if (obj instanceof IntValueArray) {
			IntValueArray other = (IntValueArray) obj;

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