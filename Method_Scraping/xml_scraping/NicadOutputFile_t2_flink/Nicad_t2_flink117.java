// clone pairs:5089:70%
// 5706:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/SnapshotResult.java

public class Nicad_t2_flink117
{
	public void discardState() throws Exception {

		Exception aggregatedExceptions = null;

		if (jobManagerOwnedSnapshot != null) {
			try {
				jobManagerOwnedSnapshot.discardState();
			} catch (Exception remoteDiscardEx) {
				aggregatedExceptions = remoteDiscardEx;
			}
		}

		if (taskLocalSnapshot != null) {
			try {
				taskLocalSnapshot.discardState();
			} catch (Exception localDiscardEx) {
				aggregatedExceptions = ExceptionUtils.firstOrSuppressed(localDiscardEx, aggregatedExceptions);
			}
		}

		if (aggregatedExceptions != null) {
			throw aggregatedExceptions;
		}
	}
}