// clone pairs:537:93%
// 497:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/appender/rewrite/MapRewritePolicy.java

public class Nicad_t1_logging72
{
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("mode=").append(mode);
        sb.append(" {");
        boolean first = true;
        for (final Map.Entry<String, Object> entry : map.entrySet()) {
            if (!first) {
                sb.append(", ");
            }
            sb.append(entry.getKey()).append('=').append(entry.getValue());
            first = false;
        }
        sb.append('}');
        return sb.toString();
    }
}