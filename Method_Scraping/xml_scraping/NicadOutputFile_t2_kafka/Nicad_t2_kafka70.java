// clone pairs:878:84%
// 391:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.java

public class Nicad_t2_kafka70
{
    public Sensor addLatencyAndThroughputSensor(final String scopeName,
                                                final String entityName,
                                                final String operationName,
                                                final Sensor.RecordingLevel recordingLevel,
                                                final String... tags) {
        final String group = groupNameFromScope(scopeName);

        final Map<String, String> tagMap = constructTags(scopeName, entityName, tags);
        final Map<String, String> allTagMap = constructTags(scopeName, "all", tags);

        // first add the global operation metrics if not yet, with the global tags only
        final Sensor parent = metrics.sensor(externalParentSensorName(operationName), recordingLevel);
        addAvgMaxLatency(parent, group, allTagMap, operationName);
        addInvocationRateAndCount(parent, group, allTagMap, operationName);

        // add the operation metrics with additional tags
        final Sensor sensor = metrics.sensor(externalChildSensorName(operationName, entityName), recordingLevel, parent);
        addAvgMaxLatency(sensor, group, tagMap, operationName);
        addInvocationRateAndCount(sensor, group, tagMap, operationName);

        parentSensors.put(sensor, parent);

        return sensor;

    }
}