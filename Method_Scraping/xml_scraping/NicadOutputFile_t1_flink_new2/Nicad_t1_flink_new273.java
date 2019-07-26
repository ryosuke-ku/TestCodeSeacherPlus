// clone pairs:5895:70%
// 6241:flink/flink-core/src/main/java/org/apache/flink/types/Record.java

public class Nicad_t1_flink_new273
{
	private static final int readVarLengthInt(DataInput in) throws IOException {
		// read first byte
		int val = in.readUnsignedByte();
		if (val >= MAX_BIT) {
			int shift = 7;
			int curr;
			val = val & 0x7f;
			while ((curr = in.readUnsignedByte()) >= MAX_BIT) {
				val |= (curr & 0x7f) << shift;
				shift += 7;
			}
			val |= curr << shift;
		}
		return val;
	}
}