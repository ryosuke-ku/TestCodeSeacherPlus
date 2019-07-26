// clone pairs:2000:80%
// 1881:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/UnlimitedWindows.java

public class Nicad_t1_kafka_new336
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