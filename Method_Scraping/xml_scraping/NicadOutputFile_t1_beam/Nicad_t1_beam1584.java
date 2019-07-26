// clone pairs:5431:80%
// 7862:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkBroadcastStateInternals.java

public class Nicad_t1_beam1584
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      FlinkKeyedCombiningState<?, ?, ?, ?> that = (FlinkKeyedCombiningState<?, ?, ?, ?>) o;

      return namespace.equals(that.namespace) && address.equals(that.address);
    }
}