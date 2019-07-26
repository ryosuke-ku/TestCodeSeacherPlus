// clone pairs:10659:81%
// 11631:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/array/LongPrimitiveArraySerializer.java

public class Nicad_t2_flink530
{
	public void serialize(long[] record, DataOutputView target) throws IOException {
		if (record == null) {
			throw new IllegalArgumentException("The record must not be null.");
		}
		
		final int len = record.length;
		target.writeInt(len);
		for (int i = 0; i < len; i++) {
			target.writeLong(record[i]);
		}
	}
}