// clone pairs:693:100%
// 980:ant/src/main/org/apache/tools/ant/taskdefs/optional/junit/JUnitTask.java

public class Nicad_t2_ant55
{
    public void handleErrorOutput(final String output) {
        if (runner != null) {
            runner.handleErrorOutput(output);
            if (showOutput) {
                super.handleErrorOutput(output);
            }
        } else {
            super.handleErrorOutput(output);
        }
    }
}