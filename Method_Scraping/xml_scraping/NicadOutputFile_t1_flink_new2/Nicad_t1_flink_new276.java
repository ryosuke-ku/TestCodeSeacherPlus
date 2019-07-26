// clone pairs:6154:88%
// 6367:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/runtime/hashtable/BinaryHashTable.java

public class Nicad_t1_flink_new276
{
	public void clearPartitions() {
		// clear the iterators, so the next call to next() will notice
		this.bucketIterator = null;
		this.probeIterator = null;

		for (int i = this.partitionsBeingBuilt.size() - 1; i >= 0; --i) {
			final BinaryHashPartition p = this.partitionsBeingBuilt.get(i);
			try {
				p.clearAllMemory(this.availableMemory);
			} catch (Exception e) {
				LOG.error("Error during partition cleanup.", e);
			}
		}
		this.partitionsBeingBuilt.clear();

		// clear the partitions that are still to be done (that have files on disk)
		for (final BinaryHashPartition p : this.partitionsPending) {
			p.clearAllMemory(this.availableMemory);
		}
	}
}