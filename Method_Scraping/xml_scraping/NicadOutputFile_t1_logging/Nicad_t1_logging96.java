// clone pairs:2368:72%
// 818:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/util/PropertiesUtil.java

public class Nicad_t1_logging96
{
    public int getIntegerProperty(final String name, final int defaultValue) {
        final String prop = getStringProperty(name);
        if (prop != null) {
            try {
                return Integer.parseInt(prop);
            } catch (final Exception ignored) {
                return defaultValue;
            }
        }
        return defaultValue;
    }
}