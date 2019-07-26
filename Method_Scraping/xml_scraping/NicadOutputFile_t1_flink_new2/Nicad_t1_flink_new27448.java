// clone pairs:27548:70%
// 42912:flink/flink-formats/flink-json/src/main/java/org/apache/flink/formats/json/JsonRowDeserializationSchema.java

public class Nicad_t1_flink_new27448
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		final JsonRowDeserializationSchema that = (JsonRowDeserializationSchema) o;
		return failOnMissingField == that.failOnMissingField && Objects.equals(typeInfo, that.typeInfo);
	}
}