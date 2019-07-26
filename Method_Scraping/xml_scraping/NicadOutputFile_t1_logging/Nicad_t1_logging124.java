// clone pairs:2882:90%
// 1167:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/appender/rolling/PatternProcessor.java

public class Nicad_t1_logging124
{
    protected final void formatFileName(final StringBuilder buf, final Object... objects) {
        for (int i = 0; i < patternConverters.length; i++) {
            final int fieldStart = buf.length();
            patternConverters[i].format(buf, objects);

            if (patternFields[i] != null) {
                patternFields[i].format(fieldStart, buf);
            }
        }
    }
}