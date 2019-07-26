// clone pairs:1519:90%
// 921:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopologyBuilder.java

public class Nicad_t1_kafka_10027
{
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            final Source source = (Source) o;
            // omit successor to avoid infinite loops
            return name.equals(source.name)
                && Objects.equals(topics, source.topics)
                && (topicPattern == null ? source.topicPattern == null :
                    topicPattern.pattern().equals(source.topicPattern.pattern()));
        }
}