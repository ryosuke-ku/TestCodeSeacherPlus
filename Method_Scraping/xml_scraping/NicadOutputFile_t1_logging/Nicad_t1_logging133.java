// clone pairs:2910:70%
// 1201:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/message/MapMessage.java

public class Nicad_t1_logging133
{
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        final MapMessage<?, ?> that = (MapMessage<?, ?>) o;

        return this.data.equals(that.data);
    }
}