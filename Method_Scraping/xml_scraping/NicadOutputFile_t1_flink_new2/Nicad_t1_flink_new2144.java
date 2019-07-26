// clone pairs:7756:84%
// 7653:flink/flink-runtime/src/main/java/org/apache/flink/runtime/operators/ReduceCombineDriver.java

public class Nicad_t1_flink_new2144
{
	public void cleanup() {
		try {
			if (sorter != null) {
				sorter.dispose();
			}
			if (table != null) {
				table.close();
			}
		} catch (Exception e) {
			// may happen during concurrent modification
		}
		taskContext.getMemoryManager().release(memory);
	}
}