// clone pairs:25945:90%
// 40067:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobAccumulatorsInfo.java

public class Nicad_t2_flink2341
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			UserTaskAccumulator that = (UserTaskAccumulator) o;
			return Objects.equals(name, that.name) &&
				Objects.equals(type, that.type) &&
				Objects.equals(value, that.value);
		}
}