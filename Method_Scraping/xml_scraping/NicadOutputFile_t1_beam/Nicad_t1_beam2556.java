// clone pairs:8537:80%
// 13109:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkStateInternals.java

public class Nicad_t1_beam2556
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      FlinkMapState<?, ?> that = (FlinkMapState<?, ?>) o;

      return namespace.equals(that.namespace) && stateId.equals(that.stateId);
    }
}