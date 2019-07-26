// clone pairs:9737:91%
// 10631:flink/flink-table/flink-table-planner-blink/src/main/java/org/apache/flink/table/functions/aggfunctions/MaxWithRetractAggFunction.java

public class Nicad_t2_flink384
{
	private void updateMax(MaxWithRetractAccumulator<T> acc) throws Exception {
		boolean hasMax = false;
		for (T key : acc.map.keys()) {
			if (!hasMax || acc.max.compareTo(key) < 0) {
				acc.max = key;
				hasMax = true;
			}
		}
		// The behavior of deleting expired data in the state backend is uncertain.
		// so `mapSize` data may exist, while `map` data may have been deleted
		// when both of them are expired.
		if (!hasMax) {
			acc.mapSize = 0L;
		}
	}
}