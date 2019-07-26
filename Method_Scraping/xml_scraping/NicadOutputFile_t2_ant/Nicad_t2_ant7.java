// clone pairs:174:72%
// 269:ant/src/main/org/apache/tools/ant/types/PatternSet.java

public class Nicad_t2_ant7
{
    public void addConfiguredPatternset(PatternSet p) {
        if (isReference()) {
            throw noChildrenAllowed();
        }
        String[] nestedIncludes = p.getIncludePatterns(getProject());
        String[] nestedExcludes = p.getExcludePatterns(getProject());

        if (nestedIncludes != null) {
            for (String nestedInclude : nestedIncludes) {
                createInclude().setName(nestedInclude);
            }
        }
        if (nestedExcludes != null) {
            for (String nestedExclude : nestedExcludes) {
                createExclude().setName(nestedExclude);
            }
        }
    }
}