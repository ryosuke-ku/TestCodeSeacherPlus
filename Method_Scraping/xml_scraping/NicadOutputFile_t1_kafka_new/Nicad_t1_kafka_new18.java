// clone pairs:753:73%
// 298:kafka/clients/src/main/java/org/apache/kafka/common/requests/StopReplicaResponse.java

public class Nicad_t1_kafka_new18
{
    protected Struct toStruct(short version) {
        Struct struct = new Struct(ApiKeys.STOP_REPLICA.responseSchema(version));

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