// clone pairs:2209:70%
// 2252:kafka/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/isolation/PluginDesc.java

public class Nicad_t1_kafka_new417
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