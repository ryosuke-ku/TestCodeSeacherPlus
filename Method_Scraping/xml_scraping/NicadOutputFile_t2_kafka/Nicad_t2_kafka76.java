// clone pairs:991:75%
// 430:kafka/connect/runtime/src/main/java/org/apache/kafka/connect/storage/KafkaConfigBackingStore.java

public class Nicad_t2_kafka76
{
    private ConnectorTaskId parseTaskId(String key) {
        String[] parts = key.split("-");
        if (parts.length < 3) return null;

        try {
            int taskNum = Integer.parseInt(parts[parts.length - 1]);
            String connectorName = Utils.join(Arrays.copyOfRange(parts, 1, parts.length - 1), "-");
            return new ConnectorTaskId(connectorName, taskNum);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}