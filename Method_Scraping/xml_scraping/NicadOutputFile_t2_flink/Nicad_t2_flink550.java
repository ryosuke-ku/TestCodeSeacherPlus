// clone pairs:10683:90%
// 11679:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/array/FloatPrimitiveArraySerializer.java

public class Nicad_t2_flink550
{
	public void serialize(float[] record, DataOutputView target) throws IOException {
		if (record == null) {
			throw new IllegalArgumentException("The record must not be null.");
		}
		
		final int len = record.length;
		target.writeInt(len);
		for (int i = 0; i < len; i++) {
			target.writeFloat(record[i]);
		}
	}
}