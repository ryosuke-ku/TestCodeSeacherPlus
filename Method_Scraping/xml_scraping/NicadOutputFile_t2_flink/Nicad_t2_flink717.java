// clone pairs:12641:70%
// 14980:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/runtime/PojoSerializer.java

public class Nicad_t2_flink717
{
	PojoSerializer(
			Class<T> clazz,
			Field[] fields,
			TypeSerializer<Object>[] fieldSerializers,
			LinkedHashMap<Class<?>, Integer> registeredClasses,
			TypeSerializer<?>[] registeredSerializers,
			Map<Class<?>, TypeSerializer<?>> subclassSerializerCache,
			ExecutionConfig executionConfig) {

		this.clazz = checkNotNull(clazz);
		this.fields = checkNotNull(fields);
		this.numFields = fields.length;
		this.fieldSerializers = checkNotNull(fieldSerializers);
		this.registeredClasses = checkNotNull(registeredClasses);
		this.registeredSerializers = checkNotNull(registeredSerializers);
		this.subclassSerializerCache = checkNotNull(subclassSerializerCache);
		this.executionConfig = checkNotNull(executionConfig);
	}
}