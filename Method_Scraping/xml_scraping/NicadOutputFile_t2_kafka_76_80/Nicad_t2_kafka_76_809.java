// clone pairs:449:80%
// 175:kafka/clients/src/main/java/org/apache/kafka/common/config/provider/FileConfigProvider.java

public class Nicad_t2_kafka_76_809
{
    public ConfigData get(String path) {
        Map<String, String> data = new HashMap<>();
        if (path == null || path.isEmpty()) {
            return new ConfigData(data);
        }
        try (Reader reader = reader(path)) {
            Properties properties = new Properties();
            properties.load(reader);
            Enumeration<Object> keys = properties.keys();
            while (keys.hasMoreElements()) {
                String key = keys.nextElement().toString();
                String value = properties.getProperty(key);
                if (value != null) {
                    data.put(key, value);
                }
            }
            return new ConfigData(data);
        } catch (IOException e) {
            throw new ConfigException("Could not read properties from file " + path);
        }
    }
}