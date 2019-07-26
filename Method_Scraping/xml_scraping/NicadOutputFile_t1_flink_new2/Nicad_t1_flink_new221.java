// clone pairs:1354:72%
// 2142:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/runtime/hashtable/BinaryHashTable.java

public class Nicad_t1_flink_new221
{
	private boolean prepareNextPartition() throws IOException {
		// finalize and cleanup the partitions of the current table
		for (final BinaryHashPartition p : this.partitionsBeingBuilt) {
			p.finalizeProbePhase(this.availableMemory, this.partitionsPending, type.needSetProbed());
		}

		this.partitionsBeingBuilt.clear();

		if (this.currentSpilledBuildSide != null) {
			this.currentSpilledBuildSide.getChannel().closeAndDelete();
			this.currentSpilledBuildSide = null;
		}

		if (this.currentSpilledProbeSide != null) {
			this.currentSpilledProbeSide.getChannel().closeAndDelete();
			this.currentSpilledProbeSide = null;
		}

		if (this.partitionsPending.isEmpty()) {
			// no more data
			return false;
		}

		// there are pending partitions
		final BinaryHashPartition p = this.partitionsPending.get(0);
		LOG.info(String.format("Begin to process spilled partition [%d]", p.getPartitionNumber()));

		if (p.probeSideRecordCounter == 0) {
			// unprobed spilled partitions are only re-processed for a build-side outer join;
			// there is no need to create a hash table since there are no probe-side records
			this.currentSpilledBuildSide = createInputView(p.getBuildSideChannel().getChannelID(),
					p.getBuildSideBlockCount(), p.getLastSegmentLimit());
			this.buildIterator = new WrappedRowIterator<>(
					new BinaryRowChannelInputViewIterator(currentSpilledBuildSide, this.binaryBuildSideSerializer),
					binaryBuildSideSerializer.createInstance());

			this.partitionsPending.remove(0);

			return true;
		}

		this.probeMatchedPhase = true;
		this.buildIterVisited = false;

		// build the next table; memory must be allocated after this call
		buildTableFromSpilledPartition(p);

		// set the probe side
		ChannelWithMeta channelWithMeta = new ChannelWithMeta(
				p.probeSideBuffer.getChannel().getChannelID(),
				p.probeSideBuffer.getBlockCount(),
				p.probeNumBytesInLastSeg);
		this.currentSpilledProbeSide = FileChannelUtil.createInputView(
				ioManager, channelWithMeta, new ArrayList<>(),
				compressionEnable, compressionCodecFactory, compressionBlockSize, segmentSize);

		ChannelReaderInputViewIterator<BinaryRow> probeReader =
				new ChannelReaderInputViewIterator(
						this.currentSpilledProbeSide, new ArrayList<>(), this.binaryProbeSideSerializer);
		this.probeIterator.set(probeReader);
		this.probeIterator.setReuse(binaryProbeSideSerializer.createInstance());

		// unregister the pending partition
		this.partitionsPending.remove(0);
		this.currentRecursionDepth = p.getRecursionLevel() + 1;

		// recursively get the next
		return nextMatching();
	}
}