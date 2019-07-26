// clone pairs:999:80%
// 1606:kylin/tool/src/main/java/org/apache/kylin/tool/KylinConfigCLI.java

public class Nicad_t1_kylin168
{
    private static Map<String, String> getPropertiesByPrefix(Properties props, String prefix) {
        Map<String, String> result = Maps.newLinkedHashMap();
        for (Map.Entry<Object, Object> entry : props.entrySet()) {
            String entryKey = (String) entry.getKey();
            if (entryKey.startsWith(prefix)) {
                result.put(entryKey.substring(prefix.length()), (String) entry.getValue());
            }
        }
        return result;
    }
}