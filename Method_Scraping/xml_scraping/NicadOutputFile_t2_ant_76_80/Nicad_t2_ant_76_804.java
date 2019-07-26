// clone pairs:238:76%
// 375:ant/src/main/org/apache/tools/ant/util/CollectionUtils.java

public class Nicad_t2_ant_76_804
{
    public static <E> Enumeration<E> asEnumeration(final Iterator<E> iter) {
        return new Enumeration<E>() {
            @Override
            public boolean hasMoreElements() {
                return iter.hasNext();
            }
            @Override
            public E nextElement() {
                return iter.next();
            }
        };
    }
}