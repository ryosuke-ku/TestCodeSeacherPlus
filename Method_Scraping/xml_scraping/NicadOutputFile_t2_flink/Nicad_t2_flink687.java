// clone pairs:11538:100%
// 13219:flink/flink-core/src/main/java/org/apache/flink/types/Record.java

public class Nicad_t2_flink687
{
		public void write(byte[] b, int off, int len) throws IOException {
			if (len < 0 || off > b.length - len) {
				throw new ArrayIndexOutOfBoundsException();
			}
			if (this.position > this.memory.length - len) {
				resize(len);
			}
			System.arraycopy(b, off, this.memory, this.position, len);
			this.position += len;
		}
}