// clone pairs:8175:80%
// 12510:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkStateInternals.java

public class Nicad_t1_beam2430
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      FlinkCombiningState<?, ?, ?, ?> that = (FlinkCombiningState<?, ?, ?, ?>) o;

      return namespace.equals(that.namespace) && stateId.equals(that.stateId);
    }
}