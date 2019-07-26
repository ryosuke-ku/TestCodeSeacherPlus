// clone pairs:1542:90%
// 966:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/CachingWindowStore.java

public class Nicad_t2_kafka124
{
        private CacheIteratorWrapper(final Bytes keyFrom,
                                     final Bytes keyTo,
                                     final long timeFrom,
                                     final long timeTo) {
            this.keyFrom = keyFrom;
            this.keyTo = keyTo;
            this.timeTo = timeTo;
            this.lastSegmentId = cacheFunction.segmentId(Math.min(timeTo, maxObservedTimestamp));

            this.segmentInterval = cacheFunction.getSegmentInterval();
            this.currentSegmentId = cacheFunction.segmentId(timeFrom);

            setCacheKeyRange(timeFrom, currentSegmentLastTime());

            this.current = cache.range(name, cacheKeyFrom, cacheKeyTo);
        }
}