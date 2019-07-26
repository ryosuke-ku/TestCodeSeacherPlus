// clone pairs:1807:70%
// 1495:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/ProcessorRecordContext.java

public class Nicad_t1_kafka_new224
{
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final ProcessorRecordContext that = (ProcessorRecordContext) o;
        return timestamp == that.timestamp &&
            offset == that.offset &&
            partition == that.partition &&
            Objects.equals(topic, that.topic) &&
            Objects.equals(headers, that.headers);
    }
}