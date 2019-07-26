// clone pairs:2926:80%
// 1234:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/message/ObjectMessage.java

public class Nicad_t1_logging142
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