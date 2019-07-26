// clone pairs:572:77%
// 213:kafka/connect/api/src/main/java/org/apache/kafka/connect/header/ConnectHeaders.java

public class Nicad_t2_kafka36
{
    public Headers apply(String key, HeaderTransform transform) {
        checkKey(key);
        if (!isEmpty()) {
            ListIterator<Header> iter = headers.listIterator();
            while (iter.hasNext()) {
                Header orig = iter.next();
                if (orig.key().equals(key)) {
                    Header updated = transform.apply(orig);
                    if (updated != null) {
                        iter.set(updated);
                    } else {
                        iter.remove();
                    }
                }
            }
        }
        return this;
    }
}