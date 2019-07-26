// clone pairs:451:75%
// 395:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/message/MessageFormatMessage.java

public class Nicad_t1_logging58
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