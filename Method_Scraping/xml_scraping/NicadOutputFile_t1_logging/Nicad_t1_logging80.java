// clone pairs:672:92%
// 622:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/async/AsyncLoggerConfig.java

public class Nicad_t1_logging80
{
    public static LoggerConfig createLogger(
            @PluginAttribute(value = "additivity", defaultBoolean = true) final boolean additivity,
            @PluginAttribute("level") final Level level,
            @Required(message = "Loggers cannot be configured without a name") @PluginAttribute("name") final String loggerName,
            @PluginAttribute("includeLocation") final String includeLocation,
            @PluginElement("AppenderRef") final AppenderRef[] refs,
            @PluginElement("Properties") final Property[] properties,
            @PluginConfiguration final Configuration config,
            @PluginElement("Filter") final Filter filter) {
        final String name = loggerName.equals(ROOT) ? Strings.EMPTY : loggerName;
        return new AsyncLoggerConfig(name, Arrays.asList(refs), filter, level, additivity, properties, config,
                includeLocation(includeLocation));
    }
}