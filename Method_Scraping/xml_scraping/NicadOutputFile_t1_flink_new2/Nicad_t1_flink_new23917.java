// clone pairs:19863:90%
// 28350:flink/flink-java/src/main/java/org/apache/flink/api/java/utils/ParameterTool.java

public class Nicad_t1_flink_new23917
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