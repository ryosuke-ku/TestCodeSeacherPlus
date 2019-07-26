// clone pairs:7666:85%
// 7593:flink/flink-formats/flink-avro/src/main/java/org/apache/flink/formats/avro/typeutils/AvroSerializer.java

public class Nicad_t2_flink284
{
	public void serialize(T value, DataOutputView target) throws IOException {
		if (CONCURRENT_ACCESS_CHECK) {
			enterExclusiveThread();
		}

		try {
			checkAvroInitialized();
			this.encoder.setOut(target);
			this.writer.write(value, this.encoder);
		}
		finally {
			if (CONCURRENT_ACCESS_CHECK) {
				exitExclusiveThread();
			}
		}
	}
}