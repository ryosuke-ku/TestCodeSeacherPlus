// clone pairs:656:100%
// 908:ant/src/main/org/apache/tools/ant/types/XMLCatalog.java

public class Nicad_t2_ant41
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