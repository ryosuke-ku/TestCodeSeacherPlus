// clone pairs:10244:72%
// 11260:flink/flink-core/src/main/java/org/apache/flink/core/memory/DataOutputSerializer.java

public class Nicad_t2_flink494
{
	public void writeBytes(String s) throws IOException {
		final int sLen = s.length();
		if (this.position >= this.buffer.length - sLen) {
			resize(sLen);
		}

		for (int i = 0; i < sLen; i++) {
			writeByte(s.charAt(i));
		}
		this.position += sLen;
	}
}