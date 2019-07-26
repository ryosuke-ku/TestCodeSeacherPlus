// clone pairs:6520:75%
// 6615:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/StateSerializerProvider.java

public class Nicad_t2_flink193
{
		public TypeSerializerSchemaCompatibility<T> registerNewSerializerForRestoredState(TypeSerializer<T> newSerializer) {
			checkNotNull(newSerializer);
			if (registeredSerializer != null) {
				throw new UnsupportedOperationException("A serializer has already been registered for the state; re-registration is not allowed.");
			}

			TypeSerializerSchemaCompatibility<T> result = previousSerializerSnapshot.resolveSchemaCompatibility(newSerializer);
			if (result.isIncompatible()) {
				invalidateCurrentSchemaSerializerAccess();
			}
			if (result.isCompatibleWithReconfiguredSerializer()) {
				this.registeredSerializer = result.getReconfiguredSerializer();
			} else {
				this.registeredSerializer = newSerializer;
			}
			return result;
		}
}