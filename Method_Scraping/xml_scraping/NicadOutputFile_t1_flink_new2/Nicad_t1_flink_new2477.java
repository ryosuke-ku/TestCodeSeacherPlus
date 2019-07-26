// clone pairs:10313:72%
// 11311:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/DuplicatingCheckpointOutputStream.java

public class Nicad_t1_flink_new2477
{
	public void sync() throws IOException {

		flushInternalBuffer();
		primaryOutputStream.sync();

		if (secondaryStreamException == null) {
			try {
				secondaryOutputStream.sync();
			} catch (Exception syncEx) {
				handleSecondaryStreamOnException(syncEx);
			}
		}
	}
}