// clone pairs:468:81%
// 420:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/lookup/Interpolator.java

public class Nicad_t1_logging61
{
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (final String name : strLookupMap.keySet()) {
            if (sb.length() == 0) {
                sb.append('{');
            } else {
                sb.append(", ");
            }

            sb.append(name);
        }
        if (sb.length() > 0) {
            sb.append('}');
        }
        return sb.toString();
    }
}