// clone pairs:955:76%
// 422:kafka/clients/src/main/java/org/apache/kafka/common/requests/SyncGroupRequest.java

public class Nicad_kafka34
{
    public AbstractResponse getErrorResponse(int throttleTimeMs, Throwable e) {
        short versionId = version();
        switch (versionId) {
            case 0:
                return new SyncGroupResponse(
                        new SyncGroupResponseData()
                            .setErrorCode(Errors.forException(e).code())
                            .setAssignment(new byte[0])
                       );
            case 1:
            case 2:
            case 3:
                return new SyncGroupResponse(
                        new SyncGroupResponseData()
                            .setErrorCode(Errors.forException(e).code())
                            .setAssignment(new byte[0])
                            .setThrottleTimeMs(throttleTimeMs)
                );
            default:
                throw new IllegalArgumentException(String.format("Version %d is not valid. Valid versions for %s are 0 to %d",
                        versionId, this.getClass().getSimpleName(), ApiKeys.SYNC_GROUP.latestVersion()));
        }
    }
}