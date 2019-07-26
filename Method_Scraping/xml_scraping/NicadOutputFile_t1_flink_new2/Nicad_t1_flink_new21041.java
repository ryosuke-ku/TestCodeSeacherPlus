// clone pairs:12654:90%
// 14890:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/runtime/ValueComparator.java

public class Nicad_t1_flink_new21041
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