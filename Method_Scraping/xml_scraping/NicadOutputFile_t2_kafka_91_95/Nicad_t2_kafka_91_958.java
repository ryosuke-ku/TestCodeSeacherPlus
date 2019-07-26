// clone pairs:1016:91%
// 462:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.java

public class Nicad_t2_kafka_91_958
{
    public Sensor nodeLevelSensor(final String taskName,
                                  final String processorNodeName,
                                  final String sensorName,
                                  final Sensor.RecordingLevel recordingLevel,
                                  final Sensor... parents) {
        final String key = nodeSensorPrefix(taskName, processorNodeName);
        synchronized (nodeLevelSensors) {
            if (!nodeLevelSensors.containsKey(key)) {
                nodeLevelSensors.put(key, new LinkedList<>());
            }

            final String fullSensorName = key + SENSOR_NAME_DELIMITER + sensorName;

            final Sensor sensor = metrics.sensor(fullSensorName, recordingLevel, parents);

            nodeLevelSensors.get(key).push(fullSensorName);

            return sensor;
        }
    }
}