// clone pairs:2188:70%
// 2212:kafka/connect/file/src/main/java/org/apache/kafka/connect/file/FileStreamSinkConnector.java

public class Nicad_kafka396
{
    public List<Map<String, String>> taskConfigs(int maxTasks) {
        ArrayList<Map<String, String>> configs = new ArrayList<>();
        for (int i = 0; i < maxTasks; i++) {
            Map<String, String> config = new HashMap<>();
            if (filename != null)
                config.put(FILE_CONFIG, filename);
            configs.add(config);
        }
        return configs;
    }
}