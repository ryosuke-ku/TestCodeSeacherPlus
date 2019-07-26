// clone pairs:6368:93%
// 6472:flink/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducerBase.java

public class Nicad_t1_flink_new285
{
	protected static int[] getPartitionsByTopic(String topic, KafkaProducer<byte[], byte[]> producer) {
		// the fetched list is immutable, so we're creating a mutable copy in order to sort it
		List<PartitionInfo> partitionsList = new ArrayList<>(producer.partitionsFor(topic));

		// sort the partitions by partition id to make sure the fetched partition list is the same across subtasks
		Collections.sort(partitionsList, new Comparator<PartitionInfo>() {
			@Override
			public int compare(PartitionInfo o1, PartitionInfo o2) {
				return Integer.compare(o1.partition(), o2.partition());
			}
		});

		int[] partitions = new int[partitionsList.size()];
		for (int i = 0; i < partitions.length; i++) {
			partitions[i] = partitionsList.get(i).partition();
		}

		return partitions;
	}
}