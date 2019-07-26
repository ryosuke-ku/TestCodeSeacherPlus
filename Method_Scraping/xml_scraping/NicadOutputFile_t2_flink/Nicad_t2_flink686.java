// clone pairs:11536:100%
// 13215:flink/flink-core/src/main/java/org/apache/flink/types/Record.java

public class Nicad_t2_flink686
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