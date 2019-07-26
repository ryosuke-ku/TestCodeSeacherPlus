// clone pairs:552:71%
// 509:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/config/properties/PropertiesConfiguration.java

public class Nicad_t1_logging75
{
    public Configuration reconfigure() {
        try {
            final ConfigurationSource source = getConfigurationSource().resetInputStream();
            if (source == null) {
                return null;
            }
            final PropertiesConfigurationFactory factory = new PropertiesConfigurationFactory();
            final PropertiesConfiguration config = factory.getConfiguration(getLoggerContext(), source);
            return config == null || config.getState() != State.INITIALIZING ? null : config;
        } catch (final IOException ex) {
            LOGGER.error("Cannot locate file {}: {}", getConfigurationSource(), ex);
        }
        return null;
    }
}