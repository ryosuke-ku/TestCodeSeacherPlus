// clone pairs:154:76%
// 233:kylin/server-base/src/main/java/org/apache/kylin/rest/service/JobService.java

public class Nicad_t1_kylin15
{
    private ExecutableState parseToExecutableState(JobStatusEnum status) {
        Message msg = MsgPicker.getMsg();

        switch (status) {
        case DISCARDED:
            return ExecutableState.DISCARDED;
        case ERROR:
            return ExecutableState.ERROR;
        case FINISHED:
            return ExecutableState.SUCCEED;
        case NEW:
            return ExecutableState.READY;
        case PENDING:
            return ExecutableState.READY;
        case RUNNING:
            return ExecutableState.RUNNING;
        case STOPPED:
            return ExecutableState.STOPPED;
        default:
            throw new BadRequestException(String.format(Locale.ROOT, msg.getILLEGAL_EXECUTABLE_STATE(), status));
        }
    }
}