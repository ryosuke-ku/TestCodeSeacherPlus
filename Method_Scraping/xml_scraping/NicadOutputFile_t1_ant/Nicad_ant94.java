// clone pairs:667:80%
// 930:ant/src/main/org/apache/tools/ant/types/RedirectorElement.java

public class Nicad_ant94
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