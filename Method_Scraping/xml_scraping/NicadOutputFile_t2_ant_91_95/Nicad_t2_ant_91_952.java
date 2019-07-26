// clone pairs:304:93%
// 503:ant/src/main/org/apache/tools/ant/types/Assertions.java

public class Nicad_t2_ant_91_952
{
    public void applyAssertions(List<String> commandList) {
        getProject().log("Applying assertions", Project.MSG_DEBUG);
        Assertions clause = getFinalReference();
        //do the system assertions
        if (Boolean.TRUE.equals(clause.enableSystemAssertions)) {
            getProject().log("Enabling system assertions", Project.MSG_DEBUG);
            commandList.add("-enablesystemassertions");
        } else if (Boolean.FALSE.equals(clause.enableSystemAssertions)) {
            getProject().log("disabling system assertions", Project.MSG_DEBUG);
            commandList.add("-disablesystemassertions");
        }

        //now any inner assertions
        for (BaseAssertion assertion : clause.assertionList) {
            String arg = assertion.toCommand();
            getProject().log("adding assertion " + arg, Project.MSG_DEBUG);
            commandList.add(arg);
        }
    }
}