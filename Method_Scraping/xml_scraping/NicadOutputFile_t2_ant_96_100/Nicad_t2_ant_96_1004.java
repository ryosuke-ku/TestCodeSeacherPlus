// clone pairs:524:100%
// 848:ant/src/main/org/apache/tools/ant/types/AbstractFileSet.java

public class Nicad_t2_ant_96_1004
{
    public synchronized void appendIncludes(String[] includes) {
        if (isReference()) {
            throw tooManyAttributes();
        }
        if (includes != null) {
            for (String include : includes) {
                defaultPatterns.createInclude().setName(include);
            }
            directoryScanner = null;
        }
    }
}