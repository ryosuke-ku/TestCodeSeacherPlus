// clone pairs:5670:72%
// 6024:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/runtime/over/NonBufferOverWindowOperator.java

public class Nicad_t2_flink143
{
	public void open() throws Exception {
		super.open();

		ClassLoader cl = getUserCodeClassloader();
		serializer = (AbstractRowSerializer) getOperatorConfig().getTypeSerializerIn1(cl);
		partitionComparator = genComparator.newInstance(cl);
		genComparator = null;

		collector = new StreamRecordCollector<>(output);
		processors = new AggsHandleFunction[aggsHandlers.length];
		joinedRows = new JoinedRow[aggsHandlers.length];
		for (int i = 0; i < aggsHandlers.length; i++) {
			AggsHandleFunction func = aggsHandlers[i].newInstance(cl);
			func.open(new PerKeyStateDataViewStore(getRuntimeContext()));
			processors[i] = func;
			joinedRows[i] = new JoinedRow();
		}
		aggsHandlers = null;
	}
}