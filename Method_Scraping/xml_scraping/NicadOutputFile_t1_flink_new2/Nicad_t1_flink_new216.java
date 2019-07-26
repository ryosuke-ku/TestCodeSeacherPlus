// clone pairs:505:85%
// 858:flink/flink-core/src/main/java/org/apache/flink/core/memory/DataOutputSerializer.java

public class Nicad_t1_flink_new216
{
	public void writeUTF(String str) throws IOException {
		int strlen = str.length();
		int utflen = 0;
		int c;

		/* use charAt instead of copying String to char array */
		for (int i = 0; i < strlen; i++) {
			c = str.charAt(i);
			if ((c >= 0x0001) && (c <= 0x007F)) {
				utflen++;
			} else if (c > 0x07FF) {
				utflen += 3;
			} else {
				utflen += 2;
			}
		}

		if (utflen > 65535) {
			throw new UTFDataFormatException("Encoded string is too long: " + utflen);
		}
		else if (this.position > this.buffer.length - utflen - 2) {
			resize(utflen + 2);
		}

		byte[] bytearr = this.buffer;
		int count = this.position;

		bytearr[count++] = (byte) ((utflen >>> 8) & 0xFF);
		bytearr[count++] = (byte) (utflen & 0xFF);

		int i;
		for (i = 0; i < strlen; i++) {
			c = str.charAt(i);
			if (!((c >= 0x0001) && (c <= 0x007F))) {
				break;
			}
			bytearr[count++] = (byte) c;
		}

		for (; i < strlen; i++) {
			c = str.charAt(i);
			if ((c >= 0x0001) && (c <= 0x007F)) {
				bytearr[count++] = (byte) c;

			} else if (c > 0x07FF) {
				bytearr[count++] = (byte) (0xE0 | ((c >> 12) & 0x0F));
				bytearr[count++] = (byte) (0x80 | ((c >>  6) & 0x3F));
				bytearr[count++] = (byte) (0x80 | (c & 0x3F));
			} else {
				bytearr[count++] = (byte) (0xC0 | ((c >> 6) & 0x1F));
				bytearr[count++] = (byte) (0x80 | (c & 0x3F));
			}
		}

		this.position = count;
	}
}