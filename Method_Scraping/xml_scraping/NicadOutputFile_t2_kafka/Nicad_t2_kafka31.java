// clone pairs:525:89%
// 199:kafka/connect/runtime/src/main/java/org/apache/kafka/connect/storage/KafkaStatusBackingStore.java

public class Nicad_t2_kafka31
{
    private ConnectorStatus parseConnectorStatus(String connector, byte[] data) {
        try {
            SchemaAndValue schemaAndValue = converter.toConnectData(topic, data);
            if (!(schemaAndValue.value() instanceof Map)) {
                log.error("Invalid connector status type {}", schemaAndValue.value().getClass());
                return null;
            }

            @SuppressWarnings("unchecked")
            Map<String, Object> statusMap = (Map<String, Object>) schemaAndValue.value();
            TaskStatus.State state = TaskStatus.State.valueOf((String) statusMap.get(STATE_KEY_NAME));
            String trace = (String) statusMap.get(TRACE_KEY_NAME);
            String workerUrl = (String) statusMap.get(WORKER_ID_KEY_NAME);
            int generation = ((Long) statusMap.get(GENERATION_KEY_NAME)).intValue();
            return new ConnectorStatus(connector, state, trace, workerUrl, generation);
        } catch (Exception e) {
            log.error("Failed to deserialize connector status", e);
            return null;
        }
    }
}