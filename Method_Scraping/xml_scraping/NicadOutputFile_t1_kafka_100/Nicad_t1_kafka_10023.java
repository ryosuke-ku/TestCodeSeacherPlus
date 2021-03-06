// clone pairs:1515:90%
// 913:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopologyBuilder.java

public class Nicad_t1_kafka_10023
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