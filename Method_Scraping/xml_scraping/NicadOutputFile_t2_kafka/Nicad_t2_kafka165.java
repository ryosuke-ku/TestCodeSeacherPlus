// clone pairs:1876:90%
// 1634:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopologyBuilder.java

public class Nicad_t2_kafka165
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