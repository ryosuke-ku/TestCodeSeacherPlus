// clone pairs:1560:90%
// 1003:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/UnlimitedWindows.java

public class Nicad_t1_kafka_10043
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