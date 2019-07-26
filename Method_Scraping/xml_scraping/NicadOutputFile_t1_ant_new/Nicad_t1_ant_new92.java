// clone pairs:520:90%
// 843:ant/src/main/org/apache/tools/ant/taskdefs/condition/AntVersion.java

public class Nicad_t1_ant_new92
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