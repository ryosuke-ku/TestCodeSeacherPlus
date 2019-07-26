// clone pairs:344:73%
// 558:ant/src/main/org/apache/tools/ant/types/Path.java

public class Nicad_t1_ant_new58
{
    protected synchronized void dieOnCircularReference(Stack<Object> stk, Project p)
        throws BuildException {
        if (isChecked()) {
            return;
        }
        if (isReference()) {
            super.dieOnCircularReference(stk, p);
        } else {
            if (union != null) {
                pushAndInvokeCircularReferenceCheck(union, stk, p);
            }
            setChecked(true);
        }
    }
}