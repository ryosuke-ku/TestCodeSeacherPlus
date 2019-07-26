// clone pairs:16739:90%
// 22385:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexAccumulatorsInfo.java

public class Nicad_t1_flink_new22560
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