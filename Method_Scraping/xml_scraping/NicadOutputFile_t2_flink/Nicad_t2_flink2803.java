// clone pairs:28029:90%
// 44145:flink/flink-java/src/main/java/org/apache/flink/api/java/utils/ParameterTool.java

public class Nicad_t2_flink2803
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ParameterTool that = (ParameterTool) o;
		return Objects.equals(data, that.data) &&
			Objects.equals(defaultData, that.defaultData) &&
			Objects.equals(unrequestedParameters, that.unrequestedParameters);
	}
}