// clone pairs:15101:90%
// 19184:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/runtime/join/SortMergeJoinIterator.java

public class Nicad_t1_flink_new21850
{
	protected boolean nextProbe() throws IOException {
		if ((probeRow = probeIterator.next(probeRow)) != null) {
			probeKey = probeProjection.apply(probeRow);
			return true;
		} else {
			probeRow = null;
			probeKey = null;
			return false;
		}
	}
}