// clone pairs:15102:90%
// 19186:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/runtime/join/SortMergeJoinIterator.java

public class Nicad_t1_flink_new21851
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