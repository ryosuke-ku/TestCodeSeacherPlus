// clone pairs:1978:75%
// 778:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/layout/Rfc5424Layout.java

public class Nicad_t1_logging92
{
    private static PatternParser createPatternParser(final Configuration config,
            final Class<? extends PatternConverter> filterClass) {
        if (config == null) {
            return new PatternParser(config, PatternLayout.KEY, LogEventPatternConverter.class, filterClass);
        }
        PatternParser parser = config.getComponent(COMPONENT_KEY);
        if (parser == null) {
            parser = new PatternParser(config, PatternLayout.KEY, ThrowablePatternConverter.class);
            config.addComponent(COMPONENT_KEY, parser);
            parser = config.getComponent(COMPONENT_KEY);
        }
        return parser;
    }
}