// clone pairs:661:90%
// 916:ant/src/main/org/apache/tools/ant/types/Mapper.java

public class Nicad_t1_ant_new104
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