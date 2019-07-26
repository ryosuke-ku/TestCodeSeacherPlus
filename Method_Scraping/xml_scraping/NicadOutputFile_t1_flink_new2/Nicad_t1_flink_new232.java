// clone pairs:3265:92%
// 4883:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/StringValueSerializer.java

public class Nicad_t1_flink_new232
{
	public void copy(DataInputView source, DataOutputView target) throws IOException {
		int len = source.readUnsignedByte();
		target.writeByte(len);

		if (len >= HIGH_BIT) {
			int shift = 7;
			int curr;
			len = len & 0x7f;
			while ((curr = source.readUnsignedByte()) >= HIGH_BIT) {
				target.writeByte(curr);
				len |= (curr & 0x7f) << shift;
				shift += 7;
			}
			target.writeByte(curr);
			len |= curr << shift;
		}

		for (int i = 0; i < len; i++) {
			int c = source.readUnsignedByte();
			target.writeByte(c);
			while (c >= HIGH_BIT) {
				c = source.readUnsignedByte();
				target.writeByte(c);
			}
		}
	}
}