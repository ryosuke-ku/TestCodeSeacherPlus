// clone pairs:1739:90%
// 1361:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/ProcessorRecordContext.java

public class Nicad_kafka186
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