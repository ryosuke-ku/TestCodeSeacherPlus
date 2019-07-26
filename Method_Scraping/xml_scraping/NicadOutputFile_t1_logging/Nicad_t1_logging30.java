// clone pairs:209:72%
// 186:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/message/StructuredDataMessage.java

public class Nicad_t1_logging30
{
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final StructuredDataMessage that = (StructuredDataMessage) o;

        if (!super.equals(o)) {
            return false;
        }
        if (type != null ? !type.equals(that.type) : that.type != null) {
            return false;
        }
        if (id != null ? !id.equals(that.id) : that.id != null) {
            return false;
        }
        if (message != null ? !message.equals(that.message) : that.message != null) {
            return false;
        }

        return true;
    }
}