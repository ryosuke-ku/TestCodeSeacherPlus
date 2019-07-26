// clone pairs:10879:81%
// 11868:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/typeutils/BinaryGenericSerializer.java

public class Nicad_t1_flink_new2523
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