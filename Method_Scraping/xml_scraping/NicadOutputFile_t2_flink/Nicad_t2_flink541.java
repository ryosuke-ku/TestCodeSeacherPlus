// clone pairs:10670:90%
// 11653:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/array/BooleanPrimitiveArraySerializer.java

public class Nicad_t2_flink541
{
	public void serialize(boolean[] record, DataOutputView target) throws IOException {
		if (record == null) {
			throw new IllegalArgumentException("The record must not be null.");
		}
		
		final int len = record.length;
		target.writeInt(len);
		for (int i = 0; i < len; i++) {
			target.writeBoolean(record[i]);
		}
	}
}