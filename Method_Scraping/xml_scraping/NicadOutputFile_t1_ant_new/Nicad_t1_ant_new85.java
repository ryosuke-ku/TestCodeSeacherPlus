// clone pairs:489:83%
// 783:ant/src/main/org/apache/tools/ant/types/AbstractFileSet.java

public class Nicad_t1_ant_new85
{
    public void setRefid(Reference r) throws BuildException {
        if (dir != null || defaultPatterns.hasPatterns(getProject())) {
            throw tooManyAttributes();
        }
        if (!additionalPatterns.isEmpty()) {
            throw noChildrenAllowed();
        }
        if (!selectors.isEmpty()) {
            throw noChildrenAllowed();
        }
        super.setRefid(r);
    }
}