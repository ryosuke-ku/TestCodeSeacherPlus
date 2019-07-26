// clone pairs:10924:72%
// 12036:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/runtime/rank/AppendOnlyTopNFunction.java

public class Nicad_t2_flink606
{
	public void open(Configuration parameters) throws Exception {
		super.open(parameters);
		int lruCacheSize = Math.max(1, (int) (cacheSize / getDefaultTopNSize()));
		kvSortedMap = new LRUMap<>(lruCacheSize);
		LOG.info("Top{} operator is using LRU caches key-size: {}", getDefaultTopNSize(), lruCacheSize);

		ListTypeInfo<BaseRow> valueTypeInfo = new ListTypeInfo<>(inputRowType);
		MapStateDescriptor<BaseRow, List<BaseRow>> mapStateDescriptor = new MapStateDescriptor<>(
				"data-state-with-append", sortKeyType, valueTypeInfo);
		dataState = getRuntimeContext().getMapState(mapStateDescriptor);

		// metrics
		registerMetric(kvSortedMap.size() * getDefaultTopNSize());
	}
}