// clone pairs:527:90%
// 853:ant/src/main/org/apache/tools/ant/types/Mapper.java

public class Nicad_t1_ant_new94
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