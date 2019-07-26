// clone pairs:159:72%
// 246:ant/src/main/org/apache/tools/ant/types/resources/ResourceList.java

public class Nicad_t1_ant_new26
{
    protected synchronized void dieOnCircularReference(Stack<Object> stk, Project p)
        throws BuildException {
        if (isChecked()) {
            return;
        }
        if (isReference()) {
            super.dieOnCircularReference(stk, p);
        } else {
            for (ResourceCollection resourceCollection : textDocuments) {
                if (resourceCollection instanceof DataType) {
                    pushAndInvokeCircularReferenceCheck((DataType) resourceCollection, stk, p);
                }
            }
            for (FilterChain filterChain : filterChains) {
                pushAndInvokeCircularReferenceCheck(filterChain, stk, p);
            }
            setChecked(true);
        }
    }
}