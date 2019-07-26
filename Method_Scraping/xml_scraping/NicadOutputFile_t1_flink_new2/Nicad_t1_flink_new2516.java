// clone pairs:10798:81%
// 11823:flink/flink-formats/flink-json/src/main/java/org/apache/flink/formats/json/JsonRowSerializationSchema.java

public class Nicad_t1_flink_new2516
{
	public byte[] serialize(Row row) {
		if (node == null) {
			node = mapper.createObjectNode();
		}

		try {
			convertRow(node, (RowTypeInfo) typeInfo, row);
			return mapper.writeValueAsBytes(node);
		} catch (Throwable t) {
			throw new RuntimeException("Could not serialize row '" + row + "'. " +
				"Make sure that the schema matches the input.", t);
		}
	}
}