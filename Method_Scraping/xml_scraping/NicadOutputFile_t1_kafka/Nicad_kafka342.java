// clone pairs:2020:80%
// 1923:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/TimeWindows.java

public class Nicad_kafka342
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