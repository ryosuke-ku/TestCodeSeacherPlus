// clone pairs:725:73%
// 273:kafka/clients/src/main/java/org/apache/kafka/common/requests/LeaderAndIsrResponse.java

public class Nicad_kafka16
{
    protected Struct toStruct(short version) {
        Struct struct = new Struct(ApiKeys.LEADER_AND_ISR.responseSchema(version));

        List<Struct> responseDatas = new ArrayList<>(responses.size());
        for (Map.Entry<TopicPartition, Errors> response : responses.entrySet()) {
            Struct partitionData = struct.instance(PARTITIONS);
            TopicPartition partition = response.getKey();
            partitionData.set(TOPIC_NAME, partition.topic());
            partitionData.set(PARTITION_ID, partition.partition());
            partitionData.set(ERROR_CODE, response.getValue().code());
            responseDatas.add(partitionData);
        }

        struct.set(PARTITIONS, responseDatas.toArray());
        struct.set(ERROR_CODE, error.code());

        return struct;
    }
}