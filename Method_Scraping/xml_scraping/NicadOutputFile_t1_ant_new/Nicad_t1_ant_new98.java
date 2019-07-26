// clone pairs:548:72%
// 872:ant/src/main/org/apache/tools/ant/types/FilterSet.java

public class Nicad_t1_ant_new98
{
    public synchronized Hashtable<String, String> getFilterHash() {
        if (isReference()) {
            return getRef().getFilterHash();
        }
        dieOnCircularReference();
        if (filterHash == null) {
            filterHash = new Hashtable<>(getFilters().size());
            getFilters().forEach(filter -> filterHash.put(filter.getToken(), filter.getValue()));
        }
        return filterHash;
    }
}