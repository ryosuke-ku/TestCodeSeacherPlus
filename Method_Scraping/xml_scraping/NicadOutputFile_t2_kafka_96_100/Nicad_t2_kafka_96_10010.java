// clone pairs:1018:100%
// 466:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.java

public class Nicad_t2_kafka_96_10010
{
    public final Sensor cacheLevelSensor(final String taskName,
                                         final String cacheName,
                                         final String sensorName,
                                         final Sensor.RecordingLevel recordingLevel,
                                         final Sensor... parents) {
        final String key = cacheSensorPrefix(taskName, cacheName);
        synchronized (cacheLevelSensors) {
            if (!cacheLevelSensors.containsKey(key)) {
                cacheLevelSensors.put(key, new LinkedList<>());
            }

            final String fullSensorName = key + SENSOR_NAME_DELIMITER + sensorName;

            final Sensor sensor = metrics.sensor(fullSensorName, recordingLevel, parents);

            cacheLevelSensors.get(key).push(fullSensorName);

            return sensor;
        }
    }
}