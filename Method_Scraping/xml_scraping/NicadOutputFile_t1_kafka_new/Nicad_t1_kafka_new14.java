// clone pairs:623:70%
// 243:kafka/clients/src/main/java/org/apache/kafka/common/requests/OffsetsForLeaderEpochRequest.java

public class Nicad_t1_kafka_new14
{
    public void OffsetsForLeaderEpochRequest(Struct struct, short version) {
        super(ApiKeys.OFFSET_FOR_LEADER_EPOCH, version);
        replicaId = struct.getOrElse(REPLICA_ID, DEBUGGING_REPLICA_ID);
        epochsByPartition = new HashMap<>();
        for (Object topicAndEpochsObj : struct.get(TOPICS)) {
            Struct topicAndEpochs = (Struct) topicAndEpochsObj;
            String topic = topicAndEpochs.get(TOPIC_NAME);
            for (Object partitionAndEpochObj : topicAndEpochs.get(PARTITIONS)) {
                Struct partitionAndEpoch = (Struct) partitionAndEpochObj;
                int partitionId = partitionAndEpoch.get(PARTITION_ID);
                int leaderEpoch = partitionAndEpoch.get(LEADER_EPOCH);
                Optional<Integer> currentEpoch = RequestUtils.getLeaderEpoch(partitionAndEpoch, CURRENT_LEADER_EPOCH);
                TopicPartition tp = new TopicPartition(topic, partitionId);
                epochsByPartition.put(tp, new PartitionData(currentEpoch, leaderEpoch));
            }
        }
    }
}