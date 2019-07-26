// clone pairs:10247:72%
// 11266:flink/flink-runtime/src/main/java/org/apache/flink/runtime/operators/sort/LargeRecordHandler.java

public class Nicad_t2_flink495
{
	public LargeRecordHandler(TypeSerializer<T> serializer, TypeComparator<T> comparator, 
			IOManager ioManager, MemoryManager memManager, List<MemorySegment> memory,
			AbstractInvokable memoryOwner, int maxFilehandles)
	{
		this.serializer = checkNotNull(serializer);
		this.comparator = checkNotNull(comparator);
		this.ioManager = checkNotNull(ioManager);
		this.memManager = checkNotNull(memManager);
		this.memory = checkNotNull(memory);
		this.memoryOwner = checkNotNull(memoryOwner);
		this.maxFilehandles = maxFilehandles;

		this.executionConfig = memoryOwner.getExecutionConfig();

		checkArgument(maxFilehandles >= 2);
	}
}