// clone pairs:664:71%
// 612:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/appender/FailoverAppender.java

public class Nicad_t1_logging78
{
    public String toString() {
        final StringBuilder sb = new StringBuilder(getName());
        sb.append(" primary=").append(primary).append(", failover={");
        boolean first = true;
        for (final String str : failovers) {
            if (!first) {
                sb.append(", ");
            }
            sb.append(str);
            first = false;
        }
        sb.append('}');
        return sb.toString();
    }
}