// clone pairs:525:100%
// 850:ant/src/main/org/apache/tools/ant/types/XMLCatalog.java

public class Nicad_t1_ant_10022
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