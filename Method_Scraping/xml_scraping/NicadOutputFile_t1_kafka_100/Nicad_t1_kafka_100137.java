// clone pairs:1841:90%
// 1565:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopologyBuilder.java

public class Nicad_t1_kafka_100137
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