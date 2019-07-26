// clone pairs:117:74%
// 85:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/message/ParameterFormatter.java

public class Nicad_t1_logging12
{
    static int countArgumentPlaceholders2(final String messagePattern, final int[] indices) {
        if (messagePattern == null) {
            return 0;
        }
        final int length = messagePattern.length();
        int result = 0;
        boolean isEscaped = false;
        for (int i = 0; i < length - 1; i++) {
            final char curChar = messagePattern.charAt(i);
            if (curChar == ESCAPE_CHAR) {
                isEscaped = !isEscaped;
                indices[0] = -1; // escaping means fast path is not available...
                result++;
            } else if (curChar == DELIM_START) {
                if (!isEscaped && messagePattern.charAt(i + 1) == DELIM_STOP) {
                    indices[result] = i;
                    result++;
                    i++;
                }
                isEscaped = false;
            } else {
                isEscaped = false;
            }
        }
        return result;
    }
}