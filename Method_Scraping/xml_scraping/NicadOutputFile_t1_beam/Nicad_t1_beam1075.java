// clone pairs:4163:80%
// 5665:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkBroadcastStateInternals.java

public class Nicad_t1_beam1075
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      FlinkBroadcastBagState<?> that = (FlinkBroadcastBagState<?>) o;

      return namespace.equals(that.namespace) && address.equals(that.address);
    }
}