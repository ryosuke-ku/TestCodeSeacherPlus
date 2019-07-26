// clone pairs:7701:78%
// 7618:flink/flink-formats/flink-avro/src/main/java/org/apache/flink/formats/avro/typeutils/AvroSerializer.java

public class Nicad_t2_flink289
{
	public T deserialize(DataInputView source) throws IOException {
		if (CONCURRENT_ACCESS_CHECK) {
			enterExclusiveThread();
		}

		try {
			checkAvroInitialized();
			this.decoder.setIn(source);
			return this.reader.read(null, this.decoder);
		}
		finally {
			if (CONCURRENT_ACCESS_CHECK) {
				exitExclusiveThread();
			}
		}
	}
}