// clone pairs:10652:100%
// 11551:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/environment/StreamExecutionEnvironment.java

public class Nicad_t1_flink_new2491
{
	public void registerType(Class<?> type) {
		if (type == null) {
			throw new NullPointerException("Cannot register null type class.");
		}

		TypeInformation<?> typeInfo = TypeExtractor.createTypeInfo(type);

		if (typeInfo instanceof PojoTypeInfo) {
			config.registerPojoType(type);
		} else {
			config.registerKryoType(type);
		}
	}
}