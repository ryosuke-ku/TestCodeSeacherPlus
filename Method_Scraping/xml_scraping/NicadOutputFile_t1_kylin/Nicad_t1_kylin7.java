// clone pairs:51:94%
// 69:kylin/core-cube/src/main/java/org/apache/kylin/cube/common/FuzzyValueCombination.java

public class Nicad_t1_kylin7
{
    private static <K, V> List<Map<K, V>> combination(Dim<K, V>[] dims) {

        List<Map<K, V>> result = Lists.newArrayList();

        int emptyDims = 0;
        for (Dim dim : dims) {
            if (dim.values.isEmpty()) {
                dim.values = SINGLE_NULL_SET;
                emptyDims++;
            }
        }
        if (emptyDims == dims.length) {
            return result;
        }

        Map<K, V> r = Maps.newHashMap();
        Iterator<V>[] iters = new Iterator[dims.length];
        int level = 0;
        while (true) {
            Dim<K, V> dim = dims[level];
            if (iters[level] == null) {
                iters[level] = dim.values.iterator();
            }

            Iterator<V> it = iters[level];
            if (it.hasNext() == false) {
                if (level == 0)
                    break;
                r.remove(dim.col);
                iters[level] = null;
                level--;
                continue;
            }

            r.put(dim.col, it.next());
            if (level == dims.length - 1) {
                result.add(new HashMap<K, V>(r));
            } else {
                level++;
            }
        }
        return result;
    }
}