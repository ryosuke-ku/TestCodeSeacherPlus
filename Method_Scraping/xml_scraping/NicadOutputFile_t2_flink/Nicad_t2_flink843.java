// clone pairs:13699:90%
// 16558:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexAccumulatorsInfo.java

public class Nicad_t2_flink843
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