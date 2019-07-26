// clone pairs:2577:70%
// 3892:flink/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducerBase.java

public class Nicad_t1_flink_new224
{
	public void invoke(IN next, Context context) throws Exception {
		// propagate asynchronous errors
		checkErroneous();

		byte[] serializedKey = schema.serializeKey(next);
		byte[] serializedValue = schema.serializeValue(next);
		String targetTopic = schema.getTargetTopic(next);
		if (targetTopic == null) {
			targetTopic = defaultTopicId;
		}

		int[] partitions = this.topicPartitionsMap.get(targetTopic);
		if (null == partitions) {
			partitions = getPartitionsByTopic(targetTopic, producer);
			this.topicPartitionsMap.put(targetTopic, partitions);
		}

		ProducerRecord<byte[], byte[]> record;
		if (flinkKafkaPartitioner == null) {
			record = new ProducerRecord<>(targetTopic, serializedKey, serializedValue);
		} else {
			record = new ProducerRecord<>(
					targetTopic,
					flinkKafkaPartitioner.partition(next, serializedKey, serializedValue, targetTopic, partitions),
					serializedKey,
					serializedValue);
		}
		if (flushOnCheckpoint) {
			synchronized (pendingRecordsLock) {
				pendingRecords++;
			}
		}
		producer.send(record, callback);
	}
}