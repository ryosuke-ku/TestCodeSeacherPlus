// clone pairs:1852:90%
// 1586:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopologyBuilder.java

public class Nicad_t2_kafka_86_9032
{
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            final Processor processor = (Processor) o;
            // omit successor to avoid infinite loops
            return name.equals(processor.name)
                && stores.equals(processor.stores)
                && predecessors.equals(processor.predecessors);
        }
}