// clone pairs:437:87%
// 378:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/message/FormattedMessage.java

public class Nicad_t1_logging55
{
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final FormattedMessage that = (FormattedMessage) o;

        if (messagePattern != null ? !messagePattern.equals(that.messagePattern) : that.messagePattern != null) {
            return false;
        }
        if (!Arrays.equals(stringArgs, that.stringArgs)) {
            return false;
        }

        return true;
    }
}