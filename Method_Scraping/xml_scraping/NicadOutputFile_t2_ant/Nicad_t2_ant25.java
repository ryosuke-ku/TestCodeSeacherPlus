// clone pairs:461:92%
// 764:ant/src/main/org/apache/tools/ant/util/regexp/Jdk14RegexpMatcher.java

public class Nicad_t2_ant25
{
    protected int getCompilerOptions(int options) {
        // be strict about line separator
        int cOptions = Pattern.UNIX_LINES;

        if (RegexpUtil.hasFlag(options, MATCH_CASE_INSENSITIVE)) {
            cOptions |= Pattern.CASE_INSENSITIVE;
        }
        if (RegexpUtil.hasFlag(options, MATCH_MULTILINE)) {
            cOptions |= Pattern.MULTILINE;
        }
        if (RegexpUtil.hasFlag(options, MATCH_SINGLELINE)) {
            cOptions |= Pattern.DOTALL;
        }

        return cOptions;
    }
}