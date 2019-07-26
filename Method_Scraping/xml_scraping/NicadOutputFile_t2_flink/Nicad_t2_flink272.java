// clone pairs:7136:71%
// 7296:flink/flink-runtime/src/main/java/org/apache/flink/runtime/zookeeper/ZooKeeperStateHandleStore.java

public class Nicad_t2_flink272
{
	public void releaseAll() throws Exception {
		Collection<String> children = getAllPaths();

		Exception exception = null;

		for (String child: children) {
			try {
				release(child);
			} catch (Exception e) {
				exception = ExceptionUtils.firstOrSuppressed(e, exception);
			}
		}

		if (exception != null) {
			throw new Exception("Could not properly release all state nodes.", exception);
		}
	}
}