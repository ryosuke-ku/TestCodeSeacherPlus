// clone pairs:476:75%
// 432:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/message/MessageFormatMessage.java

public class Nicad_t1_logging64
{
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final MessageFormatMessage that = (MessageFormatMessage) o;

        if (messagePattern != null ? !messagePattern.equals(that.messagePattern) : that.messagePattern != null) {
            return false;
        }
        return Arrays.equals(serializedParameters, that.serializedParameters);
    }
}