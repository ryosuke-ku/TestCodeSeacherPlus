// clone pairs:716:81%
// 269:kafka/clients/src/main/java/org/apache/kafka/common/requests/HeartbeatRequest.java

public class Nicad_kafka15
{
    public AbstractResponse getErrorResponse(int throttleTimeMs, Throwable e) {
        HeartbeatResponseData response = new HeartbeatResponseData();
        response.setErrorCode(Errors.forException(e).code());
        short versionId = version();
        switch (versionId) {
            case 0:
                return new HeartbeatResponse(response);
            case 1:
            case 2:
            case 3:
                response.setThrottleTimeMs(throttleTimeMs);
                return new HeartbeatResponse(response);
            default:
                throw new IllegalArgumentException(String.format("Version %d is not valid. Valid versions for %s are 0 to %d",
                        versionId, this.getClass().getSimpleName(), ApiKeys.HEARTBEAT.latestVersion()));
        }
    }
}