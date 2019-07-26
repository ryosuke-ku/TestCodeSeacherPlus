// clone pairs:15099:100%
// 19180:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/runtime/join/SortMergeJoinIterator.java

public class Nicad_t1_flink_new21848
{
	private boolean nextBuffered() throws IOException {
		if ((bufferedRow = bufferedIterator.next(bufferedRow)) != null) {
			bufferedKey = bufferedProjection.apply(bufferedRow);
			return true;
		} else {
			bufferedRow = null;
			bufferedKey = null;
			return false;
		}
	}
}