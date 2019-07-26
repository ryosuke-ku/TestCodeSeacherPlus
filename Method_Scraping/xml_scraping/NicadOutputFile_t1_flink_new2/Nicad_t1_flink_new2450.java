// clone pairs:10174:100%
// 11100:flink/flink-runtime/src/main/java/org/apache/flink/runtime/io/disk/SeekableFileChannelInputView.java

public class Nicad_t1_flink_new2450
{
	protected MemorySegment nextSegment(MemorySegment current) throws IOException {
		// check for end-of-stream
		if (numBlocksRemaining <= 0) {
			reader.close();
			throw new EOFException();
		}
		
		// send a request first. if we have only a single segment, this same segment will be the one obtained in the next lines
		if (current != null) {
			sendReadRequest(current);
		}
		
		// get the next segment
		numBlocksRemaining--;
		return reader.getNextReturnedBlock();
	}
}