// clone pairs:9136:91%
// 10288:flink/flink-runtime/src/main/java/org/apache/flink/runtime/operators/resettable/SpillingResettableIterator.java

public class Nicad_t2_flink368
{
	private SpillingResettableIterator(Iterator<T> input, TypeSerializer<T> serializer,
			MemoryManager memoryManager, IOManager ioManager,
			List<MemorySegment> memory, boolean releaseMemOnClose)
	{
		this.memoryManager = memoryManager;
		this.input = input;
		this.instance = serializer.createInstance();
		this.serializer = serializer;
		this.memorySegments = memory;
		this.releaseMemoryOnClose = releaseMemOnClose;
		
		if (LOG.isDebugEnabled()) {
			LOG.debug("Creating spilling resettable iterator with " + memory.size() + " pages of memory.");
		}
		
		this.buffer = new SpillingBuffer(ioManager, new ListMemorySegmentSource(memory), memoryManager.getPageSize());
	}
}