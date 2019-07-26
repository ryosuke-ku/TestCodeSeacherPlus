// clone pairs:2369:72%
// 820:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/util/PropertiesUtil.java

public class Nicad_t1_logging97
{
    public double getDoubleProperty(final String name, final double defaultValue) {
        final String prop = getStringProperty(name);
        if (prop != null) {
            try {
                return Double.parseDouble(prop);
            } catch (final Exception ignored) {
                return defaultValue;
            }
        }
        return defaultValue;
    }
}