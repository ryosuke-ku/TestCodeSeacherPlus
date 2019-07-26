// clone pairs:5646:80%
// 7398:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkBroadcastStateInternals.java

public class Nicad_t1_beam_2nd1147
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      FlinkCombiningStateWithContext<?, ?, ?, ?> that =
          (FlinkCombiningStateWithContext<?, ?, ?, ?>) o;

      return namespace.equals(that.namespace) && address.equals(that.address);
    }
}