// clone pairs:834:78%
// 358:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.java

public class Nicad_t2_kafka58
{
    public Map<String, String> threadLevelTagMap(final String... tags) {
        final Map<String, String> tagMap = threadLevelTagMap();
        if (tags != null) {
            if ((tags.length % 2) != 0) {
                throw new IllegalArgumentException("Tags needs to be specified in key-value pairs");
            }

            for (int i = 0; i < tags.length; i += 2) {
                tagMap.put(tags[i], tags[i + 1]);
            }
        }
        return tagMap;
    }
}