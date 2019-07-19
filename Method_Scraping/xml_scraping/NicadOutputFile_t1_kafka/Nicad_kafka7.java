// clone pairs:328:70%
// 112:kafka/clients/src/main/java/org/apache/kafka/common/requests/ProduceRequest.java

public class Nicad_kafka7
{
    public Struct toStruct() {
        // Store it in a local variable to protect against concurrent updates
        Map<TopicPartition, MemoryRecords> partitionRecords = partitionRecordsOrFail();
        short version = version();
        Struct struct = new Struct(ApiKeys.PRODUCE.requestSchema(version));
        Map<String, Map<Integer, MemoryRecords>> recordsByTopic = CollectionUtils.groupPartitionDataByTopic(partitionRecords);
        struct.set(ACKS_KEY_NAME, acks);
        struct.set(TIMEOUT_KEY_NAME, timeout);
        struct.setIfExists(NULLABLE_TRANSACTIONAL_ID, transactionalId);

        List<Struct> topicDatas = new ArrayList<>(recordsByTopic.size());
        for (Map.Entry<String, Map<Integer, MemoryRecords>> topicEntry : recordsByTopic.entrySet()) {
            Struct topicData = struct.instance(TOPIC_DATA_KEY_NAME);
            topicData.set(TOPIC_NAME, topicEntry.getKey());
            List<Struct> partitionArray = new ArrayList<>();
            for (Map.Entry<Integer, MemoryRecords> partitionEntry : topicEntry.getValue().entrySet()) {
                MemoryRecords records = partitionEntry.getValue();
                Struct part = topicData.instance(PARTITION_DATA_KEY_NAME)
                        .set(PARTITION_ID, partitionEntry.getKey())
                        .set(RECORD_SET_KEY_NAME, records);
                partitionArray.add(part);
            }
            topicData.set(PARTITION_DATA_KEY_NAME, partitionArray.toArray());
            topicDatas.add(topicData);
        }
        struct.set(TOPIC_DATA_KEY_NAME, topicDatas.toArray());
        return struct;
    }
}