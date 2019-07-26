// clone pairs:7743:100%
// 7684:flink/flink-core/src/main/java/org/apache/flink/core/memory/DataInputDeserializer.java

public class Nicad_t2_flink294
{
	public int readInt() throws IOException {
		if (this.position >= 0 && this.position < this.end - 3) {
			@SuppressWarnings("restriction")
			int value = UNSAFE.getInt(this.buffer, BASE_OFFSET + this.position);
			if (LITTLE_ENDIAN) {
				value = Integer.reverseBytes(value);
			}

			this.position += 4;
			return value;
		} else {
			throw new EOFException();
		}
	}
}