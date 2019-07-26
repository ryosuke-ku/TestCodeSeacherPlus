// clone pairs:673:92%
// 624:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/async/AsyncLoggerConfig.java

public class Nicad_t1_logging81
{
        public static LoggerConfig createLogger(
                @PluginAttribute("additivity") final String additivity,
                @PluginAttribute("level") final Level level,
                @PluginAttribute("includeLocation") final String includeLocation,
                @PluginElement("AppenderRef") final AppenderRef[] refs,
                @PluginElement("Properties") final Property[] properties,
                @PluginConfiguration final Configuration config,
                @PluginElement("Filter") final Filter filter) {
            final List<AppenderRef> appenderRefs = Arrays.asList(refs);
            final Level actualLevel = level == null ? Level.ERROR : level;
            final boolean additive = Booleans.parseBoolean(additivity, true);
            return new AsyncLoggerConfig(LogManager.ROOT_LOGGER_NAME, appenderRefs, filter, actualLevel, additive,
                    properties, config, AsyncLoggerConfig.includeLocation(includeLocation));
        }
}