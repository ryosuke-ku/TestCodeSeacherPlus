// clone pairs:2916:90%
// 1214:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/message/ObjectArrayMessage.java

public class Nicad_t1_logging136
{
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final ObjectArrayMessage that = (ObjectArrayMessage) o;
        return array == null ? that.array == null : equalObjectsOrStrings(array, that.array);
    }
}