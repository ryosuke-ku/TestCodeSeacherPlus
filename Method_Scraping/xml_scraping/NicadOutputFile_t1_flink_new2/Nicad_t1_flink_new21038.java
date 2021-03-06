// clone pairs:12631:90%
// 14862:flink/flink-connectors/flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/model/StreamShardHandle.java

public class Nicad_t1_flink_new21038
{
	public boolean equals(Object obj) {
		if (!(obj instanceof StreamShardHandle)) {
			return false;
		}

		if (obj == this) {
			return true;
		}

		StreamShardHandle other = (StreamShardHandle) obj;

		return streamName.equals(other.getStreamName()) && shard.equals(other.getShard());
	}
}