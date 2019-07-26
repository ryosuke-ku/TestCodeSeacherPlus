// clone pairs:509:73%
// 195:kafka/clients/src/main/java/org/apache/kafka/common/requests/ProduceRequest.java

public class Nicad_t1_kafka_new13
{
    public void ProduceRequest(Struct struct, short version) {
        super(ApiKeys.PRODUCE, version);
        partitionRecords = new HashMap<>();
        for (Object topicDataObj : struct.getArray(TOPIC_DATA_KEY_NAME)) {
            Struct topicData = (Struct) topicDataObj;
            String topic = topicData.get(TOPIC_NAME);
            for (Object partitionResponseObj : topicData.getArray(PARTITION_DATA_KEY_NAME)) {
                Struct partitionResponse = (Struct) partitionResponseObj;
                int partition = partitionResponse.get(PARTITION_ID);
                MemoryRecords records = (MemoryRecords) partitionResponse.getRecords(RECORD_SET_KEY_NAME);
                setFlags(records);
                partitionRecords.put(new TopicPartition(topic, partition), records);
            }
        }
        partitionSizes = createPartitionSizes(partitionRecords);
        acks = struct.getShort(ACKS_KEY_NAME);
        timeout = struct.getInt(TIMEOUT_KEY_NAME);
        transactionalId = struct.getOrElse(NULLABLE_TRANSACTIONAL_ID, null);
    }
}