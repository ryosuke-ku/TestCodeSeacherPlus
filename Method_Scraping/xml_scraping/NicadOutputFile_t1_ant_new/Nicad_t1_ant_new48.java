// clone pairs:285:75%
// 467:ant/src/main/org/apache/tools/ant/types/XMLCatalog.java

public class Nicad_t1_ant_new48
{
    protected synchronized void dieOnCircularReference(Stack<Object> stk, Project p)
        throws BuildException {
        if (isChecked()) {
            return;
        }
        if (isReference()) {
            super.dieOnCircularReference(stk, p);
        } else {
            if (classpath != null) {
                pushAndInvokeCircularReferenceCheck(classpath, stk, p);
            }
            if (catalogPath != null) {
                pushAndInvokeCircularReferenceCheck(catalogPath, stk, p);
            }
            setChecked(true);
        }
    }
}