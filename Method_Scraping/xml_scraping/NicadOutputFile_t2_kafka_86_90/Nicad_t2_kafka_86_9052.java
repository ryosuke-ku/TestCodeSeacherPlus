// clone pairs:1905:90%
// 1692:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/SessionWindows.java

public class Nicad_t2_kafka_86_9052
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