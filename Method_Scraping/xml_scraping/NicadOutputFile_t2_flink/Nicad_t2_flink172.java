// clone pairs:6226:82%
// 6408:flink/flink-core/src/main/java/org/apache/flink/core/memory/DataInputDeserializer.java

public class Nicad_t2_flink172
{
	public void readFully(@Nonnull byte[] b, int off, int len) throws IOException {
		if (len >= 0) {
			if (off <= b.length - len) {
				if (this.position <= this.end - len) {
					System.arraycopy(this.buffer, position, b, off, len);
					position += len;
				} else {
					throw new EOFException();
				}
			} else {
				throw new ArrayIndexOutOfBoundsException();
			}
		} else {
			throw new IllegalArgumentException("Length may not be negative.");
		}
	}
}