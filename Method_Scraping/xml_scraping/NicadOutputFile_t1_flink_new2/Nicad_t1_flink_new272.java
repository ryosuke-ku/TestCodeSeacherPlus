// clone pairs:5894:100%
// 6239:flink/flink-core/src/main/java/org/apache/flink/types/Record.java

public class Nicad_t1_flink_new272
{
	public void copy(DataInputView source, DataOutputView target) throws IOException {
		int val = source.readUnsignedByte();
		target.writeByte(val);
		
		if (val >= MAX_BIT) {
			int shift = 7;
			int curr;
			val = val & 0x7f;
			while ((curr = source.readUnsignedByte()) >= MAX_BIT) {
				target.writeByte(curr);
				val |= (curr & 0x7f) << shift;
				shift += 7;
			}
			target.writeByte(curr);
			val |= curr << shift;
		}
		
		target.write(source, val);
	};
}