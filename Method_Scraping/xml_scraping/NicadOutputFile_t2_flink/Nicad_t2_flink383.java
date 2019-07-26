// clone pairs:9736:91%
// 10629:flink/flink-table/flink-table-planner-blink/src/main/java/org/apache/flink/table/functions/aggfunctions/ConcatWsWithRetractAggFunction.java

public class Nicad_t2_flink383
{
	public BinaryString getValue(ConcatWsWithRetractAccumulator acc) {
		try {
			Iterable<BinaryString> accList = acc.list.get();
			if (accList == null || !accList.iterator().hasNext()) {
				// return null when the list is empty
				return null;
			} else {
				return BinaryString.concatWs(acc.delimiter, accList);
			}
		} catch (Exception e) {
			throw new FlinkRuntimeException(e);
		}
	}
}