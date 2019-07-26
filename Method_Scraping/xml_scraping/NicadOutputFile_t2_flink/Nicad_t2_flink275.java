// clone pairs:7425:85%
// 7485:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/StringValueArrayComparator.java

public class Nicad_t2_flink275
{
	private static int readStringLength(DataInputView source) throws IOException {
		int len = source.readByte() & 0xFF;

		if (len >= HIGH_BIT) {
			int shift = 7;
			int curr;
			len = len & 0x7F;
			while ((curr = source.readByte() & 0xFF) >= HIGH_BIT) {
				len |= (curr & 0x7F) << shift;
				shift += 7;
			}
			len |= curr << shift;
		}

		return len;
	}
}