// clone pairs:174:78%
// 156:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/appender/TlsSyslogFrame.java

public class Nicad_t1_logging22
{
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof TlsSyslogFrame)) {
            return false;
        }
        final TlsSyslogFrame other = (TlsSyslogFrame) obj;
        if (message == null) {
            if (other.message != null) {
                return false;
            }
        } else if (!message.equals(other.message)) {
            return false;
        }
        return true;
    }
}