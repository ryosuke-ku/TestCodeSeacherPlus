// clone pairs:23297:90%
// 34535:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobAccumulatorsInfo.java

public class Nicad_t1_flink_new25344
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