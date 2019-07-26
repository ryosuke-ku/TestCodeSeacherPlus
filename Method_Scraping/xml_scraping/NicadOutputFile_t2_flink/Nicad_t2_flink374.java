// clone pairs:9183:83%
// 10368:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/runtime/TupleSerializer.java

public class Nicad_t2_flink374
{
	public T createInstance() {
		try {
			T t = tupleClass.newInstance();
		
			for (int i = 0; i < arity; i++) {
				t.setField(fieldSerializers[i].createInstance(), i);
			}
			
			return t;
		}
		catch (Exception e) {
			throw new RuntimeException("Cannot instantiate tuple.", e);
		}
	}
}