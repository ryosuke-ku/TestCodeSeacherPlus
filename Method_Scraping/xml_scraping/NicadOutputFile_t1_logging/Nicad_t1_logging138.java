// clone pairs:2919:80%
// 1220:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/message/ObjectArrayMessage.java

public class Nicad_t1_logging138
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