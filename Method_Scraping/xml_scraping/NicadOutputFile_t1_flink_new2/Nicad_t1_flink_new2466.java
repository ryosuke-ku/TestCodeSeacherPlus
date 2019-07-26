// clone pairs:10257:72%
// 11224:flink/flink-runtime/src/main/java/org/apache/flink/runtime/operators/sort/UnilateralSortMerger.java

public class Nicad_t1_flink_new2466
{
		public SpillingThread(ExceptionHandler<IOException> exceptionHandler, CircularQueues<E> queues,
				AbstractInvokable parentTask, MemoryManager memManager, IOManager ioManager, 
				TypeSerializer<E> serializer, TypeComparator<E> comparator, 
				List<MemorySegment> sortReadMemory, List<MemorySegment> writeMemory, int maxNumFileHandles)
		{
			super(exceptionHandler, "SortMerger spilling thread", queues, parentTask);
			this.memManager = memManager;
			this.ioManager = ioManager;
			this.serializer = serializer;
			this.comparator = comparator;
			this.mergeReadMemory = sortReadMemory;
			this.writeMemory = writeMemory;
			this.maxFanIn = maxNumFileHandles;
			this.numWriteBuffersToCluster = writeMemory.size() >= 4 ? writeMemory.size() / 2 : 1;
		}
}