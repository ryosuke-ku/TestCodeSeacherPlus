// clone pairs:460:92%
// 762:ant/src/main/org/apache/tools/ant/util/regexp/JakartaRegexpMatcher.java

public class Nicad_t2_ant_91_954
{
    protected int getCompilerOptions(int options) {
        int cOptions = RE.MATCH_NORMAL;

        if (RegexpUtil.hasFlag(options, MATCH_CASE_INSENSITIVE)) {
            cOptions |= RE.MATCH_CASEINDEPENDENT;
        }
        if (RegexpUtil.hasFlag(options, MATCH_MULTILINE)) {
            cOptions |= RE.MATCH_MULTILINE;
        }
        if (RegexpUtil.hasFlag(options, MATCH_SINGLELINE)) {
            cOptions |= RE.MATCH_SINGLELINE;
        }

        return cOptions;
    }
}