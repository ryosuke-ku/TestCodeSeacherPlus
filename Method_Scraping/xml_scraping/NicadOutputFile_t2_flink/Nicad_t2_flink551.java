// clone pairs:10684:90%
// 11681:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/array/DoublePrimitiveArraySerializer.java

public class Nicad_t2_flink551
{
	public void serialize(double[] record, DataOutputView target) throws IOException {
		if (record == null) {
			throw new IllegalArgumentException("The record must not be null.");
		}
		
		final int len = record.length;
		target.writeInt(len);
		for (int i = 0; i < len; i++) {
			target.writeDouble(record[i]);
		}
	}
}