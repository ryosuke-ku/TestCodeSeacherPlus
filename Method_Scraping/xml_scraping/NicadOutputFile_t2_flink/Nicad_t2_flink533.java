// clone pairs:10662:81%
// 11637:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/array/DoublePrimitiveArraySerializer.java

public class Nicad_t2_flink533
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