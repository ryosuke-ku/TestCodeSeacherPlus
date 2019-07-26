// clone pairs:10707:90%
// 11720:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/array/CharPrimitiveArraySerializer.java

public class Nicad_t2_flink570
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