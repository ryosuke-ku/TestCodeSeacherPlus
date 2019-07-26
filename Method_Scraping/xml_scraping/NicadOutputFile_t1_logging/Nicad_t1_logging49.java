// clone pairs:363:72%
// 307:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/async/RingBufferLogEvent.java

public class Nicad_t1_logging49
{
    public void setValues(final AsyncLogger anAsyncLogger, final String aLoggerName, final Marker aMarker,
                          final String theFqcn, final Level aLevel, final Message msg, final Throwable aThrowable,
                          final StringMap mutableContextData, final ContextStack aContextStack, final long threadId,
                          final String threadName, final int threadPriority, final StackTraceElement aLocation,
                          final Clock clock, final NanoClock nanoClock) {
        this.threadPriority = threadPriority;
        this.threadId = threadId;
        this.level = aLevel;
        this.threadName = threadName;
        this.loggerName = aLoggerName;
        setMessage(msg);
        initTime(clock);
        this.nanoTime = nanoClock.nanoTime();
        this.thrown = aThrowable;
        this.thrownProxy = null;
        this.marker = aMarker;
        this.fqcn = theFqcn;
        this.location = aLocation;
        this.contextData = mutableContextData;
        this.contextStack = aContextStack;
        this.asyncLogger = anAsyncLogger;
    }
}