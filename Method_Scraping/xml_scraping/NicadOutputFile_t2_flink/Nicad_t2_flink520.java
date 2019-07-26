// clone pairs:10310:100%
// 11370:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/DuplicatingCheckpointOutputStream.java

public class Nicad_t2_flink520
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