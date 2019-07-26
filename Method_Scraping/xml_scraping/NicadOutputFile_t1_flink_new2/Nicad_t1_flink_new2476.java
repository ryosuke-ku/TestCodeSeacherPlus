// clone pairs:10312:72%
// 11309:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/DuplicatingCheckpointOutputStream.java

public class Nicad_t1_flink_new2476
{
	public void flush() throws IOException {

		flushInternalBuffer();
		primaryOutputStream.flush();

		if (secondaryStreamException == null) {
			try {
				secondaryOutputStream.flush();
			} catch (Exception flushEx) {
				handleSecondaryStreamOnException(flushEx);
			}
		}
	}
}