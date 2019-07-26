// clone pairs:1914:80%
// 1710:kafka/streams/src/main/java/org/apache/kafka/streams/KeyValue.java

public class Nicad_t2_kafka_76_8034
{
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof KeyValue)) {
            return false;
        }

        final KeyValue other = (KeyValue) obj;
        return Objects.equals(key, other.key) && Objects.equals(value, other.value);
    }
}