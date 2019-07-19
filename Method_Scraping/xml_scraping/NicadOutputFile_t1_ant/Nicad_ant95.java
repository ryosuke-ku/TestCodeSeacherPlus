// clone pairs:668:80%
// 932:ant/src/main/org/apache/tools/ant/types/RedirectorElement.java

public class Nicad_ant95
{
    public FilterChain createOutputFilterChain() {
        if (isReference()) {
            throw noChildrenAllowed();
        }
        FilterChain result = new FilterChain();
        result.setProject(getProject());
        outputFilterChains.add(result);
        setChecked(false);
        return result;
    }
}