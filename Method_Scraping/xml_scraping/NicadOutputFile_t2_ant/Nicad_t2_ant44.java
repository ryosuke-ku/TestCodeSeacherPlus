// clone pairs:671:100%
// 937:ant/src/main/org/apache/tools/ant/types/RedirectorElement.java

public class Nicad_t2_ant44
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