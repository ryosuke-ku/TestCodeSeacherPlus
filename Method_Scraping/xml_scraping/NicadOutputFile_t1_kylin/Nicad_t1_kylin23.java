// clone pairs:240:88%
// 369:kylin/engine-mr/src/main/java/org/apache/kylin/engine/mr/common/JobInfoConverter.java

public class Nicad_t1_kylin23
{
    public static JobStatusEnum parseToJobStatus(ExecutableState state) {
        switch (state) {
        case READY:
            return JobStatusEnum.PENDING;
        case RUNNING:
            return JobStatusEnum.RUNNING;
        case ERROR:
            return JobStatusEnum.ERROR;
        case DISCARDED:
            return JobStatusEnum.DISCARDED;
        case SUCCEED:
            return JobStatusEnum.FINISHED;
        case STOPPED:
            return JobStatusEnum.STOPPED;
        default:
            throw new RuntimeException("invalid state:" + state);
        }
    }
}