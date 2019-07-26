// clone pairs:27438:80%
// 42997:flink/flink-formats/flink-json/src/main/java/org/apache/flink/formats/json/JsonRowDeserializationSchema.java

public class Nicad_t2_flink2743
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