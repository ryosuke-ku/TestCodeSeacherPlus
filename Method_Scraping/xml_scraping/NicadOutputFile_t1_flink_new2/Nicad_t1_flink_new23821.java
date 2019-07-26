// clone pairs:19669:100%
// 27968:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexAccumulatorsInfo.java

public class Nicad_t1_flink_new23821
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JobVertexAccumulatorsInfo that = (JobVertexAccumulatorsInfo) o;
		return Objects.equals(id, that.id) &&
			Objects.equals(userAccumulatorList, that.userAccumulatorList);
	}
}