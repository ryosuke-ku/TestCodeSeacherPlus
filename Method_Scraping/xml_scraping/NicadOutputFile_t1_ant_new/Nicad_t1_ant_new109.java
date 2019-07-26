// clone pairs:669:80%
// 932:ant/src/main/org/apache/tools/ant/types/RedirectorElement.java

public class Nicad_t1_ant_new109
{
    public FilterChain createInputFilterChain() {
        if (isReference()) {
            throw noChildrenAllowed();
        }
        FilterChain result = new FilterChain();
        result.setProject(getProject());
        inputFilterChains.add(result);
        setChecked(false);
        return result;
    }
}