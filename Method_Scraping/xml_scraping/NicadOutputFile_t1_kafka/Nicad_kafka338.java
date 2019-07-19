// clone pairs:2014:70%
// 1911:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/UnlimitedWindows.java

public class Nicad_kafka338
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