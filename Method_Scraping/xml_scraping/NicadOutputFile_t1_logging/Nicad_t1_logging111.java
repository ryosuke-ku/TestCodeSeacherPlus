// clone pairs:2806:72%
// 1093:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/appender/AsyncAppender.java

public class Nicad_t1_logging111
{
    private static void AsyncAppender(final String name, final Filter filter, final AppenderRef[] appenderRefs,
            final String errorRef, final int queueSize, final boolean blocking, final boolean ignoreExceptions,
            final long shutdownTimeout, final Configuration config, final boolean includeLocation,
            final BlockingQueueFactory<LogEvent> blockingQueueFactory, Property[] properties) {
        super(name, filter, null, ignoreExceptions, properties);
        this.queue = blockingQueueFactory.create(queueSize);
        this.queueSize = queueSize;
        this.blocking = blocking;
        this.shutdownTimeout = shutdownTimeout;
        this.config = config;
        this.appenderRefs = appenderRefs;
        this.errorRef = errorRef;
        this.includeLocation = includeLocation;
    }
}