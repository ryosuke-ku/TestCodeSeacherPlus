// clone pairs:525:100%
// 848:ant/src/main/org/apache/tools/ant/types/XMLCatalog.java

public class Nicad_t1_ant_new93
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