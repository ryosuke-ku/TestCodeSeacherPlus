// clone pairs:667:80%
// 928:ant/src/main/org/apache/tools/ant/types/RedirectorElement.java

public class Nicad_t1_ant_new107
{
    public FilterChain createErrorFilterChain() {
        if (isReference()) {
            throw noChildrenAllowed();
        }
        FilterChain result = new FilterChain();
        result.setProject(getProject());
        errorFilterChains.add(result);
        setChecked(false);
        return result;
    }
}