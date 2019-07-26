// clone pairs:7762:84%
// 7658:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/MapSerializer.java

public class Nicad_t1_flink_new2145
{
	public Map<K, V> deserialize(DataInputView source) throws IOException {
		final int size = source.readInt();

		final Map<K, V> map = new HashMap<>(size);
		for (int i = 0; i < size; ++i) {
			K key = keySerializer.deserialize(source);

			boolean isNull = source.readBoolean();
			V value = isNull ? null : valueSerializer.deserialize(source);

			map.put(key, value);
		}

		return map;
	}
}