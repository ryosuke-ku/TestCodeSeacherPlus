// clone pairs:1843:80%
// 1567:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopologyBuilder.java

public class Nicad_t1_kafka_new244
{
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            final TopologyDescription that = (TopologyDescription) o;
            return subtopologies.equals(that.subtopologies)
                && globalStores.equals(that.globalStores);
        }
}