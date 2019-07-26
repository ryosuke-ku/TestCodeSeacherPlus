// clone pairs:9150:83%
// 10253:flink/flink-state-backends/flink-statebackend-rocksdb/src/main/java/org/apache/flink/contrib/streaming/state/RocksDBSerializedCompositeKeyBuilder.java

public class Nicad_t1_flink_new2387
{
	RocksDBSerializedCompositeKeyBuilder(
		@Nonnull TypeSerializer<K> keySerializer,
		@Nonnull DataOutputSerializer keyOutView,
		@Nonnegative int keyGroupPrefixBytes,
		boolean keySerializerTypeVariableSized,
		@Nonnegative int afterKeyMark) {
		this.keySerializer = keySerializer;
		this.keyOutView = keyOutView;
		this.keyGroupPrefixBytes = keyGroupPrefixBytes;
		this.keySerializerTypeVariableSized = keySerializerTypeVariableSized;
		this.afterKeyMark = afterKeyMark;
	}
}