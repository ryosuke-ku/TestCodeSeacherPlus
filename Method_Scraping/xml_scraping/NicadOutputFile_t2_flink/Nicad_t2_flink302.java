// clone pairs:8114:92%
// 8314:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/library/metric/directed/EdgeMetrics.java

public class Nicad_t2_flink302
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
				.append(triangleTripletCount, rhs.triangleTripletCount)
				.append(rectangleTripletCount, rhs.rectangleTripletCount)
				.append(maximumTriangleTriplets, rhs.maximumTriangleTriplets)
				.append(maximumRectangleTriplets, rhs.maximumRectangleTriplets)
				.isEquals();
		}
}