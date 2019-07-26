// clone pairs:7055:78%
// 7164:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/runtime/hashtable/BinaryHashTable.java

public class Nicad_t1_flink_new2112
{
	private void createPartitions(int numPartitions, int recursionLevel) {
		// sanity check
		ensureNumBuffersReturned(numPartitions);

		this.currentEnumerator = this.ioManager.createChannelEnumerator();

		this.partitionsBeingBuilt.clear();
		double numRecordPerPartition = (double) buildRowCount / numPartitions;
		int maxBuffer = maxInitBufferOfBucketArea(numPartitions);
		for (int i = 0; i < numPartitions; i++) {
			BinaryHashBucketArea area = new BinaryHashBucketArea(this, numRecordPerPartition, maxBuffer);
			BinaryHashPartition p = new BinaryHashPartition(area, this.binaryBuildSideSerializer,
					this.binaryProbeSideSerializer, i, recursionLevel, getNotNullNextBuffer(), this, this.segmentSize,
					compressionEnable, compressionCodecFactory, compressionBlockSize);
			area.setPartition(p);
			this.partitionsBeingBuilt.add(p);
		}
	}
}