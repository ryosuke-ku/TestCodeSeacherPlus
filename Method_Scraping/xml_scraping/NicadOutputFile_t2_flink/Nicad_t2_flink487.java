// clone pairs:10184:72%
// 11172:flink/flink-core/src/main/java/org/apache/flink/types/Record.java

public class Nicad_t2_flink487
{
		public void writeBytes(String s) throws IOException {
			final int sLen = s.length();
			if (this.position >= this.memory.length - sLen) {
				resize(sLen);
			}
			
			for (int i = 0; i < sLen; i++) {
				writeByte(s.charAt(i));
			}
			this.position += sLen;
		}
}