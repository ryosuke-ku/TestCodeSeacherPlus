// clone pairs:5463:78%
// 5855:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/functions/source/FromElementsFunction.java

public class Nicad_t1_flink_new252
{
	public FromElementsFunction(TypeSerializer<T> serializer, Iterable<T> elements) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputViewStreamWrapper wrapper = new DataOutputViewStreamWrapper(baos);

		int count = 0;
		try {
			for (T element : elements) {
				serializer.serialize(element, wrapper);
				count++;
			}
		}
		catch (Exception e) {
			throw new IOException("Serializing the source elements failed: " + e.getMessage(), e);
		}

		this.serializer = serializer;
		this.elementsSerialized = baos.toByteArray();
		this.numElements = count;
	}
}