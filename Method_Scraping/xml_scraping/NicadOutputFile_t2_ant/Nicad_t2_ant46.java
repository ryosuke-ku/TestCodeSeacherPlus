// clone pairs:673:100%
// 941:ant/src/main/org/apache/tools/ant/types/RedirectorElement.java

public class Nicad_t2_ant46
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