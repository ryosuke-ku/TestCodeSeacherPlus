// clone pairs:4901:70%
// 6252:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkBroadcastStateInternals.java

public class Nicad_t1_beam_2nd940
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      FlinkCombiningState<?, ?, ?> that = (FlinkCombiningState<?, ?, ?>) o;

      return namespace.equals(that.namespace) && address.equals(that.address);
    }
}