// clone pairs:694:90%
// 982:ant/src/main/org/apache/tools/ant/taskdefs/optional/junit/JUnitTask.java

public class Nicad_t2_ant56
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