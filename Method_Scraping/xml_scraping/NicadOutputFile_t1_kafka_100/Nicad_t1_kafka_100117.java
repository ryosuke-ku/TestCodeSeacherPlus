// clone pairs:1749:90%
// 1380:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/TimeWindows.java

public class Nicad_t1_kafka_100117
{
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final TimeWindows that = (TimeWindows) o;
        return maintainDurationMs == that.maintainDurationMs &&
            segments == that.segments &&
            sizeMs == that.sizeMs &&
            advanceMs == that.advanceMs &&
            graceMs == that.graceMs;
    }
}