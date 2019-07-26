// clone pairs:451:71%
// 177:kafka/clients/src/main/java/org/apache/kafka/common/requests/ProduceRequest.java

public class Nicad_t2_kafka23
{
    public ProduceResponse getErrorResponse(int throttleTimeMs, Throwable e) {
        /* In case the producer doesn't actually want any response */
        if (acks == 0)
            return null;

        Errors error = Errors.forException(e);
        Map<TopicPartition, ProduceResponse.PartitionResponse> responseMap = new HashMap<>();
        ProduceResponse.PartitionResponse partitionResponse = new ProduceResponse.PartitionResponse(error);

        for (TopicPartition tp : partitions())
            responseMap.put(tp, partitionResponse);

        short versionId = version();
        switch (versionId) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return new ProduceResponse(responseMap, throttleTimeMs);
            default:
                throw new IllegalArgumentException(String.format("Version %d is not valid. Valid versions for %s are 0 to %d",
                        versionId, this.getClass().getSimpleName(), ApiKeys.PRODUCE.latestVersion()));
        }
    }
}