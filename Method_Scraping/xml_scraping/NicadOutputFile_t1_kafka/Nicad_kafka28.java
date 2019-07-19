// clone pairs:832:71%
// 356:kafka/clients/src/main/java/org/apache/kafka/common/requests/StopReplicaResponse.java

public class Nicad_kafka28
{
    public StopReplicaResponse(Struct struct) {
        responses = new HashMap<>();
        for (Object responseDataObj : struct.get(PARTITIONS)) {
            Struct responseData = (Struct) responseDataObj;
            String topic = responseData.get(TOPIC_NAME);
            int partition = responseData.get(PARTITION_ID);
            Errors error = Errors.forCode(responseData.get(ERROR_CODE));
            responses.put(new TopicPartition(topic, partition), error);
        }

        error = Errors.forCode(struct.get(ERROR_CODE));
    }
}