// clone pairs:509:75%
// 823:ant/src/main/org/apache/tools/ant/types/AbstractFileSet.java

public class Nicad_ant78
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