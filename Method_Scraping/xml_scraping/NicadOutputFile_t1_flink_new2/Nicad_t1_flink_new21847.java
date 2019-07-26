// clone pairs:15093:70%
// 19168:flink/flink-runtime/src/main/java/org/apache/flink/runtime/operators/sort/FixedLengthRecordSorter.java

public class Nicad_t1_flink_new21847
{
	public void reset() {
		// reset all offsets
		this.numRecords = 0;
		this.currentSortBufferOffset = 0;
		this.sortBufferBytes = 0;
		
		// return all memory
		this.freeMemory.addAll(this.sortBuffer);
		this.sortBuffer.clear();
		
		// grab first buffers
		this.currentSortBufferSegment = nextMemorySegment();
		this.sortBuffer.add(this.currentSortBufferSegment);
		this.outView.set(this.currentSortBufferSegment);
	}
}