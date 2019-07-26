// clone pairs:10314:72%
// 11313:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/DuplicatingCheckpointOutputStream.java

public class Nicad_t1_flink_new2478
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