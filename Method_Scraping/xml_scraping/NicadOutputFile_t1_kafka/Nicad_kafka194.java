// clone pairs:1748:90%
// 1379:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/UnlimitedWindows.java

public class Nicad_kafka194
{
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final UnlimitedWindows that = (UnlimitedWindows) o;
        return startMs == that.startMs && segments == that.segments;
    }
}