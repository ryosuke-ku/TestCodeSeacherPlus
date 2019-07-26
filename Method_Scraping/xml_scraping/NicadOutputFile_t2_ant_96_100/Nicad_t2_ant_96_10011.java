// clone pairs:672:100%
// 939:ant/src/main/org/apache/tools/ant/types/RedirectorElement.java

public class Nicad_t2_ant_96_10011
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