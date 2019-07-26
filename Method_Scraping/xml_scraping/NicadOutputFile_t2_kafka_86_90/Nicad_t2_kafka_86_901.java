// clone pairs:493:89%
// 193:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/MeteredWindowStore.java

public class Nicad_t2_kafka_86_901
{
    public void init(final ProcessorContext context,
                     final StateStore root) {
        this.context = context;
        initStoreSerde(context);
        metrics = (StreamsMetricsImpl) context.metrics();

        taskName = context.taskId().toString();
        final String metricsGroup = "stream-" + metricScope + "-metrics";
        final Map<String, String> taskTags = metrics.tagMap("task-id", taskName, metricScope + "-id", "all");
        final Map<String, String> storeTags = metrics.tagMap("task-id", taskName, metricScope + "-id", name());

        putTime = createTaskAndStoreLatencyAndThroughputSensors(DEBUG, "put", metrics, metricsGroup, taskName, name(), taskTags, storeTags);
        fetchTime = createTaskAndStoreLatencyAndThroughputSensors(DEBUG, "fetch", metrics, metricsGroup, taskName, name(), taskTags, storeTags);
        flushTime = createTaskAndStoreLatencyAndThroughputSensors(DEBUG, "flush", metrics, metricsGroup, taskName, name(), taskTags, storeTags);
        final Sensor restoreTime = createTaskAndStoreLatencyAndThroughputSensors(DEBUG, "restore", metrics, metricsGroup, taskName, name(), taskTags, storeTags);

        // register and possibly restore the state from the logs
        final long startNs = time.nanoseconds();
        try {
            super.init(context, root);
        } finally {
            metrics.recordLatency(
                restoreTime,
                startNs,
                time.nanoseconds()
            );
        }
    }
}