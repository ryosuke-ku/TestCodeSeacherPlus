// clone pairs:156:83%
// 241:ant/src/main/org/apache/tools/ant/util/regexp/JakartaRegexpMatcher.java

public class Nicad_t2_ant_81_851
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