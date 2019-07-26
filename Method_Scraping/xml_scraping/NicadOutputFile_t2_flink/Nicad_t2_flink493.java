// clone pairs:10243:72%
// 11258:flink/flink-core/src/main/java/org/apache/flink/types/Record.java

public class Nicad_t2_flink493
{
		public void writeChars(String s) throws IOException {
			final int sLen = s.length();
			if (this.position >= this.memory.length - 2*sLen) {
				resize(2*sLen);
			} 
			for (int i = 0; i < sLen; i++) {
				writeChar(s.charAt(i));
			}
		}
}