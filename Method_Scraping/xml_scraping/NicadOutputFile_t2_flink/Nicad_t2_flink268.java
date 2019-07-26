// clone pairs:7047:100%
// 7200:flink/flink-runtime/src/main/java/org/apache/flink/runtime/operators/resettable/SpillingResettableIterator.java

public class Nicad_t2_flink268
{
	public List<MemorySegment> close() throws IOException {
		if (LOG.isDebugEnabled()) {
			LOG.debug("Spilling Resettable Iterator closing. Stored " + this.elementCount + " records.");
		}

		this.inView = null;
		
		final List<MemorySegment> memory = this.buffer.close();
		memory.addAll(this.memorySegments);
		this.memorySegments.clear();
		
		if (this.releaseMemoryOnClose) {
			this.memoryManager.release(memory);
			return Collections.emptyList();
		} else {
			return memory;
		}
	}
}