// clone pairs:6977:80%
// 7118:flink/flink-runtime/src/main/java/org/apache/flink/runtime/taskexecutor/slot/TaskSlotTable.java

public class Nicad_t2_flink260
{
	public boolean markSlotActive(AllocationID allocationId) throws SlotNotFoundException {
		checkInit();

		TaskSlot taskSlot = getTaskSlot(allocationId);

		if (taskSlot != null) {
			if (taskSlot.markActive()) {
				// unregister a potential timeout
				LOG.info("Activate slot {}.", allocationId);

				timerService.unregisterTimeout(allocationId);

				return true;
			} else {
				return false;
			}
		} else {
			throw new SlotNotFoundException(allocationId);
		}
	}
}