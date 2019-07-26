// clone pairs:7752:92%
// 7648:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/MapSerializer.java

public class Nicad_t1_flink_new2141
{
	public void serialize(Map<K, V> map, DataOutputView target) throws IOException {
		final int size = map.size();
		target.writeInt(size);

		for (Map.Entry<K, V> entry : map.entrySet()) {
			keySerializer.serialize(entry.getKey(), target);

			if (entry.getValue() == null) {
				target.writeBoolean(true);
			} else {
				target.writeBoolean(false);
				valueSerializer.serialize(entry.getValue(), target);
			}
		}
	}
}