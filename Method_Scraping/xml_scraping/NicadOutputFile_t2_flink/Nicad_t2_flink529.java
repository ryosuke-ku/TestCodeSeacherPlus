// clone pairs:10658:81%
// 11629:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/array/StringArraySerializer.java

public class Nicad_t2_flink529
{
	public void serialize(String[] record, DataOutputView target) throws IOException {
		if (record == null) {
			throw new IllegalArgumentException("The record must not be null.");
		}
		
		final int len = record.length;
		target.writeInt(len);
		for (int i = 0; i < len; i++) {
			StringValue.writeString(record[i], target);
		}
	}
}