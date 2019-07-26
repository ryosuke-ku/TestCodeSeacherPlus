// clone pairs:1216:90%
// 578:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/CachingWindowStore.java

public class Nicad_t2_kafka_86_907
{
        private void getNextSegmentIterator() {
            ++currentSegmentId;
            lastSegmentId = cacheFunction.segmentId(Math.min(timeTo, maxObservedTimestamp));

            if (currentSegmentId > lastSegmentId) {
                current = null;
                return;
            }

            setCacheKeyRange(currentSegmentBeginTime(), currentSegmentLastTime());

            current.close();
            current = cache.range(name, cacheKeyFrom, cacheKeyTo);
        }
}