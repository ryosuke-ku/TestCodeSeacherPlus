// clone pairs:8907:92%
// 9879:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/library/clustering/directed/AverageClusteringCoefficient.java

public class Nicad_t2_flink330
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
				.append(vertexCount, rhs.vertexCount)
				.append(averageLocalClusteringCoefficient, rhs.averageLocalClusteringCoefficient)
				.isEquals();
		}
}