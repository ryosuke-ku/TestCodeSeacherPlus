// clone pairs:1212:72%
// 570:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/NamedCache.java

public class Nicad_t2_kafka107
{
    synchronized LRUCacheEntry get(final Bytes key) {
        if (key == null) {
            return null;
        }

        final LRUNode node = getInternal(key);
        if (node == null) {
            return null;
        }
        updateLRU(node);
        return node.entry;
    }
}