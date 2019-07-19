// clone pairs:266:76%
// 84:kafka/clients/src/main/java/org/apache/kafka/common/requests/OffsetsForLeaderEpochRequest.java

public class Nicad_kafka4
{
    protected Struct toStruct() {
        Struct requestStruct = new Struct(ApiKeys.OFFSET_FOR_LEADER_EPOCH.requestSchema(version()));
        requestStruct.setIfExists(REPLICA_ID, replicaId);

        Map<String, Map<Integer, PartitionData>> topicsToPartitionEpochs = CollectionUtils.groupPartitionDataByTopic(epochsByPartition);

        List<Struct> topics = new ArrayList<>();
        for (Map.Entry<String, Map<Integer, PartitionData>> topicToEpochs : topicsToPartitionEpochs.entrySet()) {
            Struct topicsStruct = requestStruct.instance(TOPICS);
            topicsStruct.set(TOPIC_NAME, topicToEpochs.getKey());
            List<Struct> partitions = new ArrayList<>();
            for (Map.Entry<Integer, PartitionData> partitionEpoch : topicToEpochs.getValue().entrySet()) {
                Struct partitionStruct = topicsStruct.instance(PARTITIONS);
                partitionStruct.set(PARTITION_ID, partitionEpoch.getKey());

                PartitionData partitionData = partitionEpoch.getValue();
                partitionStruct.set(LEADER_EPOCH, partitionData.leaderEpoch);

                // Current leader epoch introduced in v2
                RequestUtils.setLeaderEpochIfExists(partitionStruct, CURRENT_LEADER_EPOCH, partitionData.currentLeaderEpoch);
                partitions.add(partitionStruct);
            }
            topicsStruct.set(PARTITIONS, partitions.toArray());
            topics.add(topicsStruct);
        }
        requestStruct.set(TOPICS, topics.toArray());
        return requestStruct;
    }
}