// clone pairs:11347:100%
// 12849:flink/flink-connectors/flink-hadoop-compatibility/src/main/java/org/apache/flink/api/java/typeutils/runtime/WritableSerializer.java

public class Nicad_t2_flink619
{
	private void checkKryoInitialized() {
		if (this.kryo == null) {
			this.kryo = new Kryo();

			Kryo.DefaultInstantiatorStrategy instantiatorStrategy = new Kryo.DefaultInstantiatorStrategy();
			instantiatorStrategy.setFallbackInstantiatorStrategy(new StdInstantiatorStrategy());
			kryo.setInstantiatorStrategy(instantiatorStrategy);

			this.kryo.setAsmEnabled(true);
			this.kryo.register(typeClass);
		}
	}
}