// clone pairs:1279:100%
// 712:logging-log4j2/log4j-plugins/src/main/java/org/apache/logging/log4j/plugins/convert/TypeConverterRegistry.java

public class Nicad_t1_logging87
{
    public static TypeConverterRegistry getInstance() {
        TypeConverterRegistry result = INSTANCE;
        if (result == null) {
            synchronized (INSTANCE_LOCK) {
                result = INSTANCE;
                if (result == null) {
                    INSTANCE = result = new TypeConverterRegistry();
                }
            }
        }
        return result;
    }
}