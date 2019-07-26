// clone pairs:1898:70%
// 1677:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopologyBuilder.java

public class Nicad_t1_kafka_new275
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