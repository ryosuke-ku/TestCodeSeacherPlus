// clone pairs:5546:84%
// 5947:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/ByteValueArray.java

public class Nicad_t2_flink130
{
	public boolean equals(Object obj) {
		if (obj instanceof ByteValueArray) {
			ByteValueArray other = (ByteValueArray) obj;

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