// clone pairs:660:100%
// 916:ant/src/main/org/apache/tools/ant/types/XMLCatalog.java

public class Nicad_ant90
{
    public Path createClasspath() {
        if (isReference()) {
            throw noChildrenAllowed();
        }
        if (this.classpath == null) {
            this.classpath = new Path(getProject());
        }
        setChecked(false);
        return this.classpath.createPath();
    }
}