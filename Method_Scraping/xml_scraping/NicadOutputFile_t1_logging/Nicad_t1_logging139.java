// clone pairs:2921:90%
// 1223:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/message/ObjectMessage.java

public class Nicad_t1_logging139
{
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final ObjectMessage that = (ObjectMessage) o;
        return obj == null ? that.obj == null : equalObjectsOrStrings(obj, that.obj);
    }
}