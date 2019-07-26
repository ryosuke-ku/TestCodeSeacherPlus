// clone pairs:10699:90%
// 11704:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/array/IntPrimitiveArraySerializer.java

public class Nicad_t2_flink562
{
	public void serialize(int[] record, DataOutputView target) throws IOException {
		if (record == null) {
			throw new IllegalArgumentException("The record must not be null.");
		}
		
		final int len = record.length;
		target.writeInt(len);
		for (int i = 0; i < len; i++) {
			target.writeInt(record[i]);
		}
	}
}