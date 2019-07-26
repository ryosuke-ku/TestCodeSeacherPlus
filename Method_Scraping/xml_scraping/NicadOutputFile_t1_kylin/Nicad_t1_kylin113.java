// clone pairs:665:83%
// 1085:kylin/core-cube/src/main/java/org/apache/kylin/cube/common/FuzzyValueCombination.java

public class Nicad_t1_kylin113
{
    private static <K, V> Dim<K, V>[] toDims(Map<K, Set<V>> fuzzyValues) {
        Dim[] dims = new Dim[fuzzyValues.size()];
        int i = 0;
        for (Entry<K, Set<V>> entry : fuzzyValues.entrySet()) {
            dims[i] = new Dim<K, V>();
            dims[i].col = entry.getKey();
            dims[i].values = entry.getValue();
            if (dims[i].values == null)
                dims[i].values = Collections.emptySet();
            i++;
        }
        return dims;
    }
}