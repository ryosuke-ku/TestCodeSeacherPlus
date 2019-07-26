// clone pairs:6325:70%
// 6447:flink/flink-formats/flink-avro/src/main/java/org/apache/flink/formats/avro/typeutils/AvroSerializer.java

public class Nicad_t1_flink_new284
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