// clone pairs:8965:92%
// 9979:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/library/clustering/directed/TriadicCensus.java

public class Nicad_t2_flink342
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

			Result rhs = (Result) obj;

			return new EqualsBuilder()
				.append(counts, rhs.counts)
				.isEquals();
		}
}