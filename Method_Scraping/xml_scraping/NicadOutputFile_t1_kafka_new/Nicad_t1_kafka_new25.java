// clone pairs:827:71%
// 351:kafka/clients/src/main/java/org/apache/kafka/common/requests/CreateAclsRequest.java

public class Nicad_t1_kafka_new25
{
    public AbstractResponse getErrorResponse(int throttleTimeMs, Throwable throwable) {
        short versionId = version();
        switch (versionId) {
            case 0:
            case 1:
                List<CreateAclsResponse.AclCreationResponse> responses = new ArrayList<>();
                for (int i = 0; i < aclCreations.size(); i++)
                    responses.add(new CreateAclsResponse.AclCreationResponse(ApiError.fromThrowable(throwable)));
                return new CreateAclsResponse(throttleTimeMs, responses);
            default:
                throw new IllegalArgumentException(String.format("Version %d is not valid. Valid versions for %s are 0 to %d",
                        versionId, this.getClass().getSimpleName(), ApiKeys.CREATE_ACLS.latestVersion()));
        }
    }
}