// clone pairs:11530:90%
// 13121:flink/flink-connectors/flink-hadoop-compatibility/src/main/java/org/apache/flink/api/java/typeutils/runtime/WritableComparator.java

public class Nicad_t1_flink_new2778
{
	private void checkKryoInitialized() {
		if (this.kryo == null) {
			this.kryo = new Kryo();

			Kryo.DefaultInstantiatorStrategy instantiatorStrategy = new Kryo.DefaultInstantiatorStrategy();
			instantiatorStrategy.setFallbackInstantiatorStrategy(new StdInstantiatorStrategy());
			kryo.setInstantiatorStrategy(instantiatorStrategy);

			this.kryo.setAsmEnabled(true);
			this.kryo.register(type);
		}
	}
}