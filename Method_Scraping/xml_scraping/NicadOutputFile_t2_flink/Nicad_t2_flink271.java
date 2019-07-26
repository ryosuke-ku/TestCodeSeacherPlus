// clone pairs:7135:85%
// 7294:flink/flink-runtime/src/main/java/org/apache/flink/runtime/zookeeper/ZooKeeperStateHandleStore.java

public class Nicad_t2_flink271
{
	public void releaseAndTryRemoveAll() throws Exception {
		Collection<String> children = getAllPaths();

		Exception exception = null;

		for (String child : children) {
			try {
				releaseAndTryRemove('/' + child);
			} catch (Exception e) {
				exception = ExceptionUtils.firstOrSuppressed(e, exception);
			}
		}

		if (exception != null) {
			throw new Exception("Could not properly release and try removing all state nodes.", exception);
		}
	}
}