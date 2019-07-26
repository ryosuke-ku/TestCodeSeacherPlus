// clone pairs:8964:92%
// 9977:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/library/clustering/directed/TriadicCensus.java

public class Nicad_t2_flink341
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