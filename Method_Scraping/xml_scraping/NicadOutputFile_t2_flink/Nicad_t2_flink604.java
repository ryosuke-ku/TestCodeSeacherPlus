// clone pairs:10882:81%
// 11953:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/typeutils/BinaryGenericSerializer.java

public class Nicad_t2_flink604
{
		public TypeSerializerSchemaCompatibility<BinaryGeneric<T>> resolveSchemaCompatibility(TypeSerializer<BinaryGeneric<T>> newSerializer) {
			if (!(newSerializer instanceof BinaryGenericSerializer)) {
				return TypeSerializerSchemaCompatibility.incompatible();
			}

			BinaryGenericSerializer newBinaryGenericSerializer = (BinaryGenericSerializer) newSerializer;
			if (!previousType.equals(newBinaryGenericSerializer.type)) {
				return TypeSerializerSchemaCompatibility.incompatible();
			} else {
				return TypeSerializerSchemaCompatibility.compatibleAsIs();
			}
		}
}