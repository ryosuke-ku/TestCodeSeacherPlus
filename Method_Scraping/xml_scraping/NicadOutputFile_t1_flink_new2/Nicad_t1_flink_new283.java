// clone pairs:6322:76%
// 6445:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/MapSerializer.java

public class Nicad_t1_flink_new283
{
	public void copy(DataInputView source, DataOutputView target) throws IOException {
		final int size = source.readInt();
		target.writeInt(size);

		for (int i = 0; i < size; ++i) {
			keySerializer.copy(source, target);
			
			boolean isNull = source.readBoolean();
			target.writeBoolean(isNull);
			
			if (!isNull) {
				valueSerializer.copy(source, target);
			}
		}
	}
}