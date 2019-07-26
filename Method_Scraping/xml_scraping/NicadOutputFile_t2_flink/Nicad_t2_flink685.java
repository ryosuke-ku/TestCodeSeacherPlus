// clone pairs:11534:100%
// 13211:flink/flink-core/src/main/java/org/apache/flink/types/Record.java

public class Nicad_t2_flink685
{
		public void writeInt(int v) throws IOException {
			if (this.position >= this.memory.length - 3) {
				resize(4);
			}
			if (LITTLE_ENDIAN) {
				v = Integer.reverseBytes(v);
			}			
			UNSAFE.putInt(this.memory, BASE_OFFSET + this.position, v);
			this.position += 4;
		}
}