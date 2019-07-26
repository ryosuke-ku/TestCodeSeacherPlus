// clone pairs:10713:90%
// 11732:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/array/CharPrimitiveArraySerializer.java

public class Nicad_t2_flink576
{
	public void serialize(char[] record, DataOutputView target) throws IOException {
		if (record == null) {
			throw new IllegalArgumentException("The record must not be null.");
		}
		
		final int len = record.length;
		target.writeInt(len);
		for (int i = 0; i < len; i++) {
			target.writeChar(record[i]);
		}
	}
}