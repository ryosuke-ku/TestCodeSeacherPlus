// clone pairs:1015:83%
// 460:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.java

public class Nicad_t2_kafka_81_8520
{
    public final Sensor taskLevelSensor(final String taskName,
                                        final String sensorName,
                                        final RecordingLevel recordingLevel,
                                        final Sensor... parents) {
        final String key = taskSensorPrefix(taskName);
        synchronized (taskLevelSensors) {
            if (!taskLevelSensors.containsKey(key)) {
                taskLevelSensors.put(key, new LinkedList<>());
            }

            final String fullSensorName = key + SENSOR_NAME_DELIMITER + sensorName;

            final Sensor sensor = metrics.sensor(fullSensorName, recordingLevel, parents);

            taskLevelSensors.get(key).push(fullSensorName);

            return sensor;
        }
    }
}