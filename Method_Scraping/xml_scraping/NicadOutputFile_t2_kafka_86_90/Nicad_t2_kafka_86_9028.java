// clone pairs:1834:90%
// 1550:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/TimeWindows.java

public class Nicad_t2_kafka_86_9028
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