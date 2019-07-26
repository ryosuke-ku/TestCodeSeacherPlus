// clone pairs:10885:81%
// 11959:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/typeutils/BinaryRowSerializer.java

public class Nicad_t2_flink605
{
		public TypeSerializerSchemaCompatibility<BinaryRow> resolveSchemaCompatibility(
				TypeSerializer<BinaryRow> newSerializer) {
			if (!(newSerializer instanceof BinaryRowSerializer)) {
				return TypeSerializerSchemaCompatibility.incompatible();
			}

			BinaryRowSerializer newBinaryRowSerializer = (BinaryRowSerializer) newSerializer;
			if (previousNumFields != newBinaryRowSerializer.numFields) {
				return TypeSerializerSchemaCompatibility.incompatible();
			} else {
				return TypeSerializerSchemaCompatibility.compatibleAsIs();
			}
		}
}