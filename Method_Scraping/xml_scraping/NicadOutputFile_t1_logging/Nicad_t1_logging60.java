// clone pairs:453:75%
// 398:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/message/StringFormattedMessage.java

public class Nicad_t1_logging60
{
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final StringFormattedMessage that = (StringFormattedMessage) o;

        if (messagePattern != null ? !messagePattern.equals(that.messagePattern) : that.messagePattern != null) {
            return false;
        }

        return Arrays.equals(stringArgs, that.stringArgs);
    }
}