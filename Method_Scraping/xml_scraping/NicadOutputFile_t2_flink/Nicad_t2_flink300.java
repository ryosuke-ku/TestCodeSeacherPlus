// clone pairs:8109:100%
// 8304:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/asm/dataset/ChecksumHashCode.java

public class Nicad_t2_flink300
{
		public boolean equals(Object obj) {
			if (obj == null) {
				return false;
			}

			if (obj == this) {
				return true;
			}

			if (obj.getClass() != getClass()) {
				return false;
			}

			Checksum rhs = (Checksum) obj;

			return new EqualsBuilder()
				.append(count, rhs.count)
				.append(checksum, rhs.checksum)
				.isEquals();
		}
}