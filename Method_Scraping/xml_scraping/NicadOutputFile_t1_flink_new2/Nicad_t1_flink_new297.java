// clone pairs:6584:100%
// 6638:flink/flink-connectors/flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java

public class Nicad_t1_flink_new297
{
	public static StreamShardMetadata convertToStreamShardMetadata(StreamShardHandle streamShardHandle) {
		StreamShardMetadata streamShardMetadata = new StreamShardMetadata();

		streamShardMetadata.setStreamName(streamShardHandle.getStreamName());
		streamShardMetadata.setShardId(streamShardHandle.getShard().getShardId());
		streamShardMetadata.setParentShardId(streamShardHandle.getShard().getParentShardId());
		streamShardMetadata.setAdjacentParentShardId(streamShardHandle.getShard().getAdjacentParentShardId());

		if (streamShardHandle.getShard().getHashKeyRange() != null) {
			streamShardMetadata.setStartingHashKey(streamShardHandle.getShard().getHashKeyRange().getStartingHashKey());
			streamShardMetadata.setEndingHashKey(streamShardHandle.getShard().getHashKeyRange().getEndingHashKey());
		}

		if (streamShardHandle.getShard().getSequenceNumberRange() != null) {
			streamShardMetadata.setStartingSequenceNumber(streamShardHandle.getShard().getSequenceNumberRange().getStartingSequenceNumber());
			streamShardMetadata.setEndingSequenceNumber(streamShardHandle.getShard().getSequenceNumberRange().getEndingSequenceNumber());
		}

		return streamShardMetadata;
	}
}