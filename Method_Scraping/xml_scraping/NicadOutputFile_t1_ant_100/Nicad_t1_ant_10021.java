// clone pairs:520:90%
// 845:ant/src/main/org/apache/tools/ant/taskdefs/condition/AntVersion.java

public class Nicad_t1_ant_10021
{
    public boolean eval() throws BuildException {
        validate();
        DeweyDecimal actual = getVersion();
        if (null != atLeast) {
            return actual.isGreaterThanOrEqual(new DeweyDecimal(atLeast));
        }
        if (null != exactly) {
            return actual.isEqual(new DeweyDecimal(exactly));
        }
        //default
        return false;
    }
}