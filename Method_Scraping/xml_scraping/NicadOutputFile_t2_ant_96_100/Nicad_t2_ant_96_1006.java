// clone pairs:551:100%
// 880:ant/src/main/org/apache/tools/ant/types/PatternSet.java

public class Nicad_t2_ant_96_1006
{
    public void setIncludes(String includes) {
        if (isReference()) {
            throw tooManyAttributes();
        }
        if (includes != null && !includes.isEmpty()) {
            StringTokenizer tok = new StringTokenizer(includes, ", ", false);
            while (tok.hasMoreTokens()) {
                createInclude().setName(tok.nextToken());
            }
        }
    }
}