// clone pairs:1213:90%
// 572:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/InMemorySessionStore.java

public class Nicad_t2_kafka_86_906
{
    public void close() {
        if (openIterators.size() != 0) {
            LOG.warn("Closing {} open iterators for store {}", openIterators.size(), name);
            for (final InMemorySessionStoreIterator it : openIterators) {
                it.close();
            }
        }

        endTimeMap.clear();
        openIterators.clear();
        open = false;
    }
}