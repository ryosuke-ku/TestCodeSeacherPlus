// clone pairs:1827:90%
// 1536:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopologyBuilder.java

public class Nicad_t2_kafka142
{
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            final Sink sink = (Sink) o;
            return name.equals(sink.name)
                && topicNameExtractor.equals(sink.topicNameExtractor)
                && predecessors.equals(sink.predecessors);
        }
}