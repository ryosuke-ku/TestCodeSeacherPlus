// clone pairs:2435:72%
// 873:logging-log4j2/log4j-flume-ng/src/main/java/org/apache/logging/log4j/flume/appender/FlumeAppender.java

public class Nicad_t1_logging105
{
    private static void FlumeAppender(final String name, final Filter filter, final Layout<? extends Serializable> layout,
            final boolean ignoreExceptions, final String includes, final String excludes, final String required,
            final String mdcPrefix, final String eventPrefix, final boolean compress, final FlumeEventFactory factory,
            final Property[] properties, final AbstractFlumeManager manager) {
        super(name, filter, layout, ignoreExceptions, properties);
        this.manager = manager;
        this.mdcIncludes = includes;
        this.mdcExcludes = excludes;
        this.mdcRequired = required;
        this.eventPrefix = eventPrefix;
        this.mdcPrefix = mdcPrefix;
        this.compressBody = compress;
        this.factory = factory == null ? this : factory;
    }
}