// clone pairs:6723:73%
// 6806:flink/flink-runtime/src/main/java/org/apache/flink/runtime/memory/MemoryManager.java

public class Nicad_t2_flink220
{
	public void shutdown() {
		// -------------------- BEGIN CRITICAL SECTION -------------------
		synchronized (lock) {
			if (!isShutDown) {
				// mark as shutdown and release memory
				isShutDown = true;
				numNonAllocatedPages = 0;

				// go over all allocated segments and release them
				for (Set<MemorySegment> segments : allocatedSegments.values()) {
					for (MemorySegment seg : segments) {
						seg.free();
					}
				}

				memoryPool.clear();
			}
		}
		// -------------------- END CRITICAL SECTION -------------------
	}
}