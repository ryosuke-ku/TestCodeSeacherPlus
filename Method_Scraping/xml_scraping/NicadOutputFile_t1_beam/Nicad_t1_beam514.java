// clone pairs:2760:80%
// 3281:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkBroadcastStateInternals.java

public class Nicad_t1_beam514
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