// clone pairs:220:76%
// 339:ant/src/main/org/apache/tools/ant/util/regexp/JakartaRegexpMatcher.java

public class Nicad_t2_ant9
{
    public Vector<String> getGroups(String input, int options)
        throws BuildException {
        RE reg = getCompiledPattern(options);
        if (!matches(input, reg)) {
            return null;
        }
        Vector<String> v = new Vector<>();
        int cnt = reg.getParenCount();
        for (int i = 0; i < cnt; i++) {
            String match = reg.getParen(i);
            // treat non-matching groups as empty matches
            if (match == null) {
                match = "";
            }
            v.add(match);
        }
        return v;
    }
}