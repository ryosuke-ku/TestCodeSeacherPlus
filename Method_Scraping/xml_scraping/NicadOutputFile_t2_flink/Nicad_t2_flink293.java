// clone pairs:7741:100%
// 7682:flink/flink-core/src/main/java/org/apache/flink/core/memory/DataInputDeserializer.java

public class Nicad_t2_flink293
{
	public long readLong() throws IOException {
		if (position >= 0 && position < this.end - 7) {
			@SuppressWarnings("restriction")
			long value = UNSAFE.getLong(this.buffer, BASE_OFFSET + this.position);
			if (LITTLE_ENDIAN) {
				value = Long.reverseBytes(value);
			}
			this.position += 8;
			return value;
		} else {
			throw new EOFException();
		}
	}
}