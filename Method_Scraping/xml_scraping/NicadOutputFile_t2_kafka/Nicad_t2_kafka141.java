// clone pairs:1826:90%
// 1534:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopologyBuilder.java

public class Nicad_t2_kafka141
{
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            final Subtopology that = (Subtopology) o;
            return id == that.id
                && nodes.equals(that.nodes);
        }
}