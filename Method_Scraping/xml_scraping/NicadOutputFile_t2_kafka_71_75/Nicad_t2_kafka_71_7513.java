// clone pairs:571:72%
// 211:kafka/clients/src/main/java/org/apache/kafka/common/requests/JoinGroupRequest.java

public class Nicad_t2_kafka_71_7513
{
    public AbstractResponse getErrorResponse(int throttleTimeMs, Throwable e) {
        short versionId = version();
        switch (versionId) {
            case 0:
            case 1:
                return new JoinGroupResponse(
                        new JoinGroupResponseData()
                                .setErrorCode(Errors.forException(e).code())
                                .setGenerationId(JoinGroupResponse.UNKNOWN_GENERATION_ID)
                                .setProtocolName(JoinGroupResponse.UNKNOWN_PROTOCOL)
                                .setLeader(JoinGroupResponse.UNKNOWN_MEMBER_ID)
                                .setMemberId(JoinGroupResponse.UNKNOWN_MEMBER_ID)
                                .setMembers(Collections.emptyList())
                );
            case 2:
            case 3:
            case 4:
            case 5:
                return new JoinGroupResponse(
                        new JoinGroupResponseData()
                                .setThrottleTimeMs(throttleTimeMs)
                                .setErrorCode(Errors.forException(e).code())
                                .setGenerationId(JoinGroupResponse.UNKNOWN_GENERATION_ID)
                                .setProtocolName(JoinGroupResponse.UNKNOWN_PROTOCOL)
                                .setLeader(JoinGroupResponse.UNKNOWN_MEMBER_ID)
                                .setMemberId(JoinGroupResponse.UNKNOWN_MEMBER_ID)
                                .setMembers(Collections.emptyList())
                );
            default:
                throw new IllegalArgumentException(String.format("Version %d is not valid. Valid versions for %s are 0 to %d",
                        versionId, this.getClass().getSimpleName(), ApiKeys.JOIN_GROUP.latestVersion()));
        }
    }
}