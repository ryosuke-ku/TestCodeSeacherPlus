// clone pairs:8279:80%
// 12676:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkStateInternals.java

public class Nicad_t1_beam2461
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

      return namespace.equals(that.namespace) && stateId.equals(that.stateId);
    }
}