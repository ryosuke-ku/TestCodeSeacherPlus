// clone pairs:11306:70%
// 12692:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/runtime/kryo/KryoSerializerSnapshot.java

public class Nicad_t1_flink_new2662
{
	public TypeSerializerSchemaCompatibility<T> resolveSchemaCompatibility(TypeSerializer<T> newSerializer) {
		if (!(newSerializer instanceof KryoSerializer)) {
			return TypeSerializerSchemaCompatibility.incompatible();
		}
		KryoSerializer<T> kryoSerializer = (KryoSerializer<T>) newSerializer;
		if (kryoSerializer.getType() != snapshotData.getTypeClass()) {
			return TypeSerializerSchemaCompatibility.incompatible();
		}
		return resolveSchemaCompatibility(kryoSerializer);
	}
}