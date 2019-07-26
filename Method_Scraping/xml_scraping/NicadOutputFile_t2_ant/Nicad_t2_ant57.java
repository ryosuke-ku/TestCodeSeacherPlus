// clone pairs:695:90%
// 984:ant/src/main/org/apache/tools/ant/taskdefs/optional/junit/JUnitTask.java

public class Nicad_t2_ant57
{
    protected void handleFlush(final String output) {
        if (runner != null) {
            runner.handleFlush(output);
            if (showOutput) {
                super.handleFlush(output);
            }
        } else {
            super.handleFlush(output);
        }
    }
}