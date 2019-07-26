// clone pairs:115:77%
// 208:flink/flink-core/src/main/java/org/apache/flink/core/memory/DataInputDeserializer.java

public class Nicad_t1_flink_new25
{
	public String readUTF() throws IOException {
		int utflen = readUnsignedShort();
		byte[] bytearr = new byte[utflen];
		char[] chararr = new char[utflen];

		int c, char2, char3;
		int count = 0;
		int chararrCount = 0;

		readFully(bytearr, 0, utflen);

		while (count < utflen) {
			c = (int) bytearr[count] & 0xff;
			if (c > 127) {
				break;
			}
			count++;
			chararr[chararrCount++] = (char) c;
		}

		while (count < utflen) {
			c = (int) bytearr[count] & 0xff;
			switch (c >> 4) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
				/* 0xxxxxxx */
				count++;
				chararr[chararrCount++] = (char) c;
				break;
			case 12:
			case 13:
				/* 110x xxxx 10xx xxxx */
				count += 2;
				if (count > utflen) {
					throw new UTFDataFormatException("malformed input: partial character at end");
				}
				char2 = (int) bytearr[count - 1];
				if ((char2 & 0xC0) != 0x80) {
					throw new UTFDataFormatException("malformed input around byte " + count);
				}
				chararr[chararrCount++] = (char) (((c & 0x1F) << 6) | (char2 & 0x3F));
				break;
			case 14:
				/* 1110 xxxx 10xx xxxx 10xx xxxx */
				count += 3;
				if (count > utflen) {
					throw new UTFDataFormatException("malformed input: partial character at end");
				}
				char2 = (int) bytearr[count - 2];
				char3 = (int) bytearr[count - 1];
				if (((char2 & 0xC0) != 0x80) || ((char3 & 0xC0) != 0x80)) {
					throw new UTFDataFormatException("malformed input around byte " + (count - 1));
				}
				chararr[chararrCount++] = (char) (((c & 0x0F) << 12) | ((char2 & 0x3F) << 6) | (char3 & 0x3F));
				break;
			default:
				/* 10xx xxxx, 1111 xxxx */
				throw new UTFDataFormatException("malformed input around byte " + count);
			}
		}
		// The number of chars produced may be less than utflen
		return new String(chararr, 0, chararrCount);
	}
}