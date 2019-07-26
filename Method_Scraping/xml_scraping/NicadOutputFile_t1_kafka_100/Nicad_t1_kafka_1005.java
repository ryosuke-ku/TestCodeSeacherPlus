// clone pairs:1031:91%
// 492:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/KeyValueSegments.java

public class Nicad_t1_kafka_1005
{
    public KeyValueSegment getOrCreateSegment(final long segmentId,
                                              final InternalProcessorContext context) {
        if (segments.containsKey(segmentId)) {
            return segments.get(segmentId);
        } else {
            final KeyValueSegment newSegment = new KeyValueSegment(segmentName(segmentId), name, segmentId);

            if (segments.put(segmentId, newSegment) != null) {
                throw new IllegalStateException("KeyValueSegment already exists. Possible concurrent access.");
            }

            newSegment.openDB(context);
            return newSegment;
        }
    }
}