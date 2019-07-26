// clone pairs:3438:92%
// 4998:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/runtime/hashtable/BinaryHashTable.java

public class Nicad_t1_flink_new236
{
	protected int spillPartition() throws IOException {
		// find the largest partition
		int largestNumBlocks = 0;
		int largestPartNum = -1;

		for (int i = 0; i < partitionsBeingBuilt.size(); i++) {
			BinaryHashPartition p = partitionsBeingBuilt.get(i);
			if (p.isInMemory() && p.getNumOccupiedMemorySegments() > largestNumBlocks) {
				largestNumBlocks = p.getNumOccupiedMemorySegments();
				largestPartNum = i;
			}
		}
		final BinaryHashPartition p = partitionsBeingBuilt.get(largestPartNum);

		// spill the partition
		int numBuffersFreed = p.spillPartition(this.ioManager,
				this.currentEnumerator.next(), this.buildSpillReturnBuffers);
		this.buildSpillRetBufferNumbers += numBuffersFreed;

		LOG.info(String.format("Grace hash join: Ran out memory, choosing partition " +
						"[%d] to spill, %d memory segments being freed",
				largestPartNum, numBuffersFreed));

		// grab as many buffers as are available directly
		MemorySegment currBuff;
		while (this.buildSpillRetBufferNumbers > 0 && (currBuff = this.buildSpillReturnBuffers.poll()) != null) {
			this.availableMemory.add(currBuff);
			this.buildSpillRetBufferNumbers--;
		}
		numSpillFiles++;
		spillInBytes += numBuffersFreed * segmentSize;
		// The bloomFilter is built after the data is spilled, so that we can use enough memory.
		p.buildBloomFilterAndFreeBucket();
		return largestPartNum;
	}
}