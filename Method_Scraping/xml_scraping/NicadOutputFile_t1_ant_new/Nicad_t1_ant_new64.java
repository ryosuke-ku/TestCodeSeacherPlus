// clone pairs:397:71%
// 654:ant/src/main/org/apache/tools/ant/types/AbstractFileSet.java

public class Nicad_t1_ant_new64
{
    protected synchronized void dieOnCircularReference(Stack<Object> stk, Project p)
        throws BuildException {
        if (isChecked()) {
            return;
        }
        if (isReference()) {
            super.dieOnCircularReference(stk, p);
        } else {
            selectors.stream().filter(DataType.class::isInstance).map(DataType.class::cast)
                    .forEach(type -> pushAndInvokeCircularReferenceCheck(type, stk, p));
            additionalPatterns.forEach(ps -> pushAndInvokeCircularReferenceCheck(ps, stk, p));
            setChecked(true);
        }
    }
}