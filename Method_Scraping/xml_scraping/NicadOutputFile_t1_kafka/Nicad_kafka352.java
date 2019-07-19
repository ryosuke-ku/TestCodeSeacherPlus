// clone pairs:2033:80%
// 1948:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/SessionWindows.java

public class Nicad_kafka352
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