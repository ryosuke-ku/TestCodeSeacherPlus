// clone pairs:527:90%
// 855:ant/src/main/org/apache/tools/ant/types/Mapper.java

public class Nicad_ant81
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
    }
}