// clone pairs:680:100%
// 956:ant/src/main/org/apache/tools/ant/types/Mapper.java

public class Nicad_t1_ant_10029
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