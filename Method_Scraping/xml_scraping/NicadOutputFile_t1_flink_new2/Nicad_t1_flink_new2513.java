// clone pairs:10762:90%
// 11754:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/operators/StreamGroupedFold.java

public class Nicad_t1_flink_new2513
{
	public void setOutputType(TypeInformation<OUT> outTypeInfo, ExecutionConfig executionConfig) {
		outTypeSerializer = outTypeInfo.createSerializer(executionConfig);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputViewStreamWrapper out = new DataOutputViewStreamWrapper(baos);

		try {
			outTypeSerializer.serialize(initialValue, out);
		} catch (IOException ioe) {
			throw new RuntimeException("Unable to serialize initial value of type " +
					initialValue.getClass().getSimpleName() + " of fold operator.", ioe);
		}

		serializedInitialValue = baos.toByteArray();
	}
}