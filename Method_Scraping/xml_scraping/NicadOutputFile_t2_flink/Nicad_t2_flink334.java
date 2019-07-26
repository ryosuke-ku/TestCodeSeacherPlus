// clone pairs:8920:92%
// 9903:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/library/metric/directed/VertexMetrics.java

public class Nicad_t2_flink334
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
				.append(unidirectionalEdgeCount, rhs.unidirectionalEdgeCount)
				.append(bidirectionalEdgeCount, rhs.bidirectionalEdgeCount)
				.append(tripletCount, rhs.tripletCount)
				.append(maximumDegree, rhs.maximumDegree)
				.append(maximumOutDegree, rhs.maximumOutDegree)
				.append(maximumInDegree, rhs.maximumInDegree)
				.append(maximumTriplets, rhs.maximumTriplets)
				.isEquals();
		}
}