// clone pairs:238:88%
// 365:kylin/engine-mr/src/main/java/org/apache/kylin/engine/mr/common/JobInfoConverter.java

public class Nicad_t1_kylin21
{
    public static JobStepStatusEnum parseToJobStepStatus(ExecutableState state) {
        switch (state) {
        case READY:
            return JobStepStatusEnum.PENDING;
        case RUNNING:
            return JobStepStatusEnum.RUNNING;
        case ERROR:
            return JobStepStatusEnum.ERROR;
        case DISCARDED:
            return JobStepStatusEnum.DISCARDED;
        case SUCCEED:
            return JobStepStatusEnum.FINISHED;
        case STOPPED:
            return JobStepStatusEnum.STOPPED;
        default:
            throw new RuntimeException("invalid state:" + state);
        }
    }
}