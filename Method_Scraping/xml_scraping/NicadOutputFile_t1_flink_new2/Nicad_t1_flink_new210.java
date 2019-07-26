// clone pairs:337:75%
// 592:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/runtime/hashtable/BinaryHashTable.java

public class Nicad_t1_flink_new210
{
	private void buildTableFromSpilledPartition(
			final BinaryHashPartition p) throws IOException {

		final int nextRecursionLevel = p.getRecursionLevel() + 1;
		if (nextRecursionLevel == 2) {
			LOG.info("Recursive hash join: partition number is " + p.getPartitionNumber());
		} else if (nextRecursionLevel > MAX_RECURSION_DEPTH) {
			throw new RuntimeException("Hash join exceeded maximum number of recursions, without reducing "
					+ "partitions enough to be memory resident. Probably cause: Too many duplicate keys.");
		}

		if (p.getBuildSideBlockCount() > p.getProbeSideBlockCount()) {
			LOG.info(String.format(
					"Hash join: Partition(%d) " +
							"build side block [%d] more than probe side block [%d]",
					p.getPartitionNumber(),
					p.getBuildSideBlockCount(),
					p.getProbeSideBlockCount()));
		}

		// we distinguish two cases here:
		// 1) The partition fits entirely into main memory. That is the case if we have enough buffers for
		//    all partition segments, plus enough buffers to hold the table structure.
		//    --> We read the partition in as it is and create a hashtable that references only
		//        that single partition.
		// 2) We can not guarantee that enough memory segments are available and read the partition
		//    in, distributing its data among newly created partitions.
		final int totalBuffersAvailable = this.availableMemory.size() + this.buildSpillRetBufferNumbers;
		if (totalBuffersAvailable != this.reservedNumBuffers + this.allocatedFloatingNum) {
			throw new RuntimeException(String.format("Hash Join bug in memory management: Memory buffers leaked." +
					" availableMemory(%s), buildSpillRetBufferNumbers(%s), reservedNumBuffers(%s), allocatedFloatingNum(%s)",
					availableMemory.size(), buildSpillRetBufferNumbers, reservedNumBuffers, allocatedFloatingNum));
		}

		long numBuckets = p.getBuildSideRecordCount() / BinaryHashBucketArea.NUM_ENTRIES_PER_BUCKET + 1;

		// we need to consider the worst case where everything hashes to one bucket which needs to overflow by the same
		// number of total buckets again. Also, one buffer needs to remain for the probing
		int maxBucketAreaBuffers = Math.max((int) (2 * (numBuckets / (this.bucketsPerSegmentMask + 1))), 1);
		final long totalBuffersNeeded = maxBucketAreaBuffers + p.getBuildSideBlockCount() + 2;

		if (totalBuffersNeeded < totalBuffersAvailable) {
			LOG.info(String.format("Build in memory hash table from spilled partition [%d]", p.getPartitionNumber()));

			// first read the partition in
			final List<MemorySegment> partitionBuffers = readAllBuffers(p.getBuildSideChannel().getChannelID(), p.getBuildSideBlockCount());
			BinaryHashBucketArea area = new BinaryHashBucketArea(this, (int) p.getBuildSideRecordCount(), maxBucketAreaBuffers);
			final BinaryHashPartition newPart = new BinaryHashPartition(area, this.binaryBuildSideSerializer, this.binaryProbeSideSerializer,
					0, nextRecursionLevel, partitionBuffers, p.getBuildSideRecordCount(), this.segmentSize, p.getLastSegmentLimit());
			area.setPartition(newPart);

			this.partitionsBeingBuilt.add(newPart);

			// now, index the partition through a hash table
			final BinaryHashPartition.PartitionIterator pIter = newPart.newPartitionIterator();

			while (pIter.advanceNext()) {
				final int hashCode = hash(buildSideProjection.apply(pIter.getRow()).hashCode(), nextRecursionLevel);
				final int pointer = (int) pIter.getPointer();
				area.insertToBucket(hashCode, pointer, false, true);
			}
		} else {
			// go over the complete input and insert every element into the hash table
			// compute in how many splits, we'd need to partition the result
			final int splits = (int) (totalBuffersNeeded / totalBuffersAvailable) + 1;
			final int partitionFanOut = Math.min(Math.min(10 * splits, MAX_NUM_PARTITIONS), maxNumPartition());

			createPartitions(partitionFanOut, nextRecursionLevel);
			LOG.info(String.format("Build hybrid hash table from spilled partition [%d] with recursion level [%d]",
					p.getPartitionNumber(), nextRecursionLevel));

			ChannelReaderInputView inView = createInputView(p.getBuildSideChannel().getChannelID(), p.getBuildSideBlockCount(), p.getLastSegmentLimit());
			final BinaryRowChannelInputViewIterator inIter =
					new BinaryRowChannelInputViewIterator(inView, this.binaryBuildSideSerializer);
			BinaryRow rec = this.binaryBuildSideSerializer.createInstance();
			while ((rec = inIter.next(rec)) != null) {
				final int hashCode = hash(this.buildSideProjection.apply(rec).hashCode(), nextRecursionLevel);
				insertIntoTable(rec, hashCode);
			}

			inView.getChannel().closeAndDelete();

			// finalize the partitions
			int buildWriteBuffers = 0;
			for (BinaryHashPartition part : this.partitionsBeingBuilt) {
				buildWriteBuffers += part.finalizeBuildPhase(this.ioManager, this.currentEnumerator);
			}
			buildSpillRetBufferNumbers += buildWriteBuffers;
		}
	}
}