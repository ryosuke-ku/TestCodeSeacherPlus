// clone pairs:530:90%
// 860:ant/src/main/org/apache/tools/ant/types/XMLCatalog.java

public class Nicad_t2_ant35
{
    public void setClasspath(Path classpath) {
        if (isReference()) {
            throw tooManyAttributes();
        }
        if (this.classpath == null) {
            this.classpath = classpath;
        } else {
            this.classpath.append(classpath);
        }
        setChecked(false);
    }
}