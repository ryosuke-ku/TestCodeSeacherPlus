// clone pairs:2032:90%
// 1946:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/JoinWindows.java

public class Nicad_t2_kafka_86_9074
{
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final JoinWindows that = (JoinWindows) o;
        return beforeMs == that.beforeMs &&
            afterMs == that.afterMs &&
            maintainDurationMs == that.maintainDurationMs &&
            segments == that.segments &&
            graceMs == that.graceMs;
    }
}