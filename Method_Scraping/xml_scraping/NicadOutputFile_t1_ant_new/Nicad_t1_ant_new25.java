// clone pairs:158:77%
// 244:ant/src/main/org/apache/tools/ant/types/resources/ResourceList.java

public class Nicad_t1_ant_new25
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