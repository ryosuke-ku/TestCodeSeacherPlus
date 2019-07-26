// clone pairs:2669:72%
// 3980:flink/flink-runtime/src/main/java/org/apache/flink/runtime/io/disk/SeekableFileChannelInputView.java

public class Nicad_t1_flink_new226
{
	public SeekableFileChannelInputView(IOManager ioManager, FileIOChannel.ID channelId, MemoryManager memManager, List<MemorySegment> memory, int sizeOfLastBlock) throws IOException {
		super(0);
		
		checkNotNull(ioManager);
		checkNotNull(channelId);
		checkNotNull(memManager);
		checkNotNull(memory);
		
		this.ioManager = ioManager;
		this.channelId = channelId;
		this.memManager = memManager;
		this.memory = memory;
		this.sizeOfLastBlock = sizeOfLastBlock;
		this.segmentSize = memManager.getPageSize();
		
		this.reader = ioManager.createBlockChannelReader(channelId);
		
		try {
			final long channelLength = reader.getSize();
			
			final int blockCount =  MathUtils.checkedDownCast(channelLength / segmentSize);
			this.numBlocksTotal = (channelLength % segmentSize == 0) ? blockCount : blockCount + 1;

			this.numBlocksRemaining = this.numBlocksTotal;
			this.numRequestsRemaining = numBlocksRemaining;
			
			for (int i = 0; i < memory.size(); i++) {
				sendReadRequest(memory.get(i));
			}
			
			advance();
		}
		catch (IOException e) {
			memManager.release(memory);
			throw e;
		}
	}
}