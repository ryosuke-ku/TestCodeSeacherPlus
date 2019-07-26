// clone pairs:9141:83%
// 10292:flink/flink-runtime/src/main/java/org/apache/flink/runtime/resourcemanager/slotmanager/SlotManager.java

public class Nicad_t2_flink369
{
	public boolean unregisterSlotRequest(AllocationID allocationId) {
		checkInit();

		PendingSlotRequest pendingSlotRequest = pendingSlotRequests.remove(allocationId);

		if (null != pendingSlotRequest) {
			LOG.debug("Cancel slot request {}.", allocationId);

			cancelPendingSlotRequest(pendingSlotRequest);

			return true;
		} else {
			LOG.debug("No pending slot request with allocation id {} found. Ignoring unregistration request.", allocationId);

			return false;
		}
	}
}