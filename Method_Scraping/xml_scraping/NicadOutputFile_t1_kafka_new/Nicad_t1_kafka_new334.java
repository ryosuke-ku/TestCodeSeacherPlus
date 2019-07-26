// clone pairs:1996:70%
// 1872:kafka/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/isolation/PluginDesc.java

public class Nicad_t1_kafka_new334
{
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PluginDesc)) {
            return false;
        }
        PluginDesc<?> that = (PluginDesc<?>) o;
        return Objects.equals(klass, that.klass) &&
                Objects.equals(version, that.version) &&
                type == that.type;
    }
}