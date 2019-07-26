// clone pairs:77:90%
// 131:ant/src/main/org/apache/tools/ant/taskdefs/condition/AntVersion.java

public class Nicad_t1_ant_10010
{
    private void validate() throws BuildException {
        if (atLeast != null && exactly != null) {
            throw new BuildException("Only one of atleast or exactly may be set.");
        }
        if (null == atLeast && null == exactly) {
            throw new BuildException("One of atleast or exactly must be set.");
        }
        if (atLeast != null) {
            try {
                // only created for side effect
                new DeweyDecimal(atLeast); //NOSONAR
            } catch (NumberFormatException e) {
                throw new BuildException(
                    "The 'atleast' attribute is not a Dewey Decimal eg 1.1.0 : %s",
                    atLeast);
            }
        } else {
            try {
                // only created for side effect
                new DeweyDecimal(exactly); //NOSONAR
            } catch (NumberFormatException e) {
                throw new BuildException(
                    "The 'exactly' attribute is not a Dewey Decimal eg 1.1.0 : %s",
                    exactly);
            }
        }
    }
}