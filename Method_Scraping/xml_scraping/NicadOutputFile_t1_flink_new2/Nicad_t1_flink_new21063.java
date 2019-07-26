// clone pairs:12886:80%
// 15151:flink/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaTopicPartition.java

public class Nicad_t1_flink_new21063
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		else if (o instanceof KafkaTopicPartition) {
			KafkaTopicPartition that = (KafkaTopicPartition) o;
			return this.partition == that.partition && this.topic.equals(that.topic);
		}
		else {
			return false;
		}
	}
}