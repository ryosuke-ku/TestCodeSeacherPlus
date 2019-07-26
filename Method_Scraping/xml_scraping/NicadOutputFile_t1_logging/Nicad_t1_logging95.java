// clone pairs:2366:72%
// 814:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/util/PropertiesUtil.java

public class Nicad_t1_logging95
{
    public long getLongProperty(final String name, final long defaultValue) {
        final String prop = getStringProperty(name);
        if (prop != null) {
            try {
                return Long.parseLong(prop);
            } catch (final Exception ignored) {
                return defaultValue;
            }
        }
        return defaultValue;
    }
}