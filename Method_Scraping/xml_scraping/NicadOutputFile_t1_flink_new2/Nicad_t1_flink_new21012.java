// clone pairs:12197:70%
// 14394:flink/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/AbstractFetcher.java

public class Nicad_t1_flink_new21012
{
		public Long getValue() {
			switch(gaugeType) {
				case COMMITTED_OFFSET:
					return ktp.getCommittedOffset();
				case CURRENT_OFFSET:
					return ktp.getOffset();
				default:
					throw new RuntimeException("Unknown gauge type: " + gaugeType);
			}
		}
}