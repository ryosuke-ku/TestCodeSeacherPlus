// clone pairs:1075:83%
// 534:kafka/clients/src/main/java/org/apache/kafka/common/requests/DescribeAclsRequest.java

public class Nicad_t1_kafka_new45
{
    public AbstractResponse getErrorResponse(int throttleTimeMs, Throwable throwable) {
        short versionId = version();
        switch (versionId) {
            case 0:
            case 1:
                return new DescribeAclsResponse(throttleTimeMs, ApiError.fromThrowable(throwable),
                        Collections.emptySet());
            default:
                throw new IllegalArgumentException(String.format("Version %d is not valid. Valid versions for %s are 0 to %d",
                        versionId, this.getClass().getSimpleName(), ApiKeys.DESCRIBE_ACLS.latestVersion()));
        }
    }
}