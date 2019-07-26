// clone pairs:1717:90%
// 1314:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopologyBuilder.java

public class Nicad_t1_kafka_new186
{
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            final GlobalStore that = (GlobalStore) o;
            return source.equals(that.source)
                && processor.equals(that.processor);
        }
}