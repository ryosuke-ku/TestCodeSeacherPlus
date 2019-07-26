// clone pairs:11532:100%
// 13207:flink/flink-core/src/main/java/org/apache/flink/types/Record.java

public class Nicad_t2_flink684
{
		public void writeLong(long v) throws IOException {
			if (this.position >= this.memory.length - 7) {
				resize(8);
			}
			if (LITTLE_ENDIAN) {
				v = Long.reverseBytes(v);
			}
			UNSAFE.putLong(this.memory, BASE_OFFSET + this.position, v);
			this.position += 8;
		}
}