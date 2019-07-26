// clone pairs:2966:70%
// 1251:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/appender/routing/RoutingAppender.java

public class Nicad_t1_logging146
{
    public boolean stop(final long timeout, final TimeUnit timeUnit) {
        setStopping();
        super.stop(timeout, timeUnit, false);
        // Only stop appenders that were created by this RoutingAppender
        for (final Map.Entry<String, CreatedRouteAppenderControl> entry : createdAppenders.entrySet()) {
            final Appender appender = entry.getValue().getAppender();
            appender.stop(timeout, timeUnit);
        }
        setStopped();
        return true;
    }
}