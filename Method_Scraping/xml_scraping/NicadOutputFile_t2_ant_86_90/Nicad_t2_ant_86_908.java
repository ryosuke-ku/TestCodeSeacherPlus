// clone pairs:683:90%
// 960:ant/src/main/org/apache/tools/ant/Project.java

public class Nicad_t2_ant_86_908
{
    public void demuxOutput(final String output, final boolean isWarning) {
        final Task task = getThreadTask(Thread.currentThread());
        if (task == null) {
            log(output, isWarning ? MSG_WARN : MSG_INFO);
        } else if (isWarning) {
            task.handleErrorOutput(output);
        } else {
            task.handleOutput(output);
        }
    }
}