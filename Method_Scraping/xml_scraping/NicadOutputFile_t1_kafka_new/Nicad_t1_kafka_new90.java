// clone pairs:1490:90%
// 861:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/SessionWindows.java

public class Nicad_t1_kafka_new90
{
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final SessionWindows that = (SessionWindows) o;
        return gapMs == that.gapMs &&
            maintainDurationMs == that.maintainDurationMs &&
            graceMs == that.graceMs;
    }
}