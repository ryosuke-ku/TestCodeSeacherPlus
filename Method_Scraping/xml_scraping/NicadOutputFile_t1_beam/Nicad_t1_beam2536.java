// clone pairs:8517:80%
// 13070:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkStateInternals.java

public class Nicad_t1_beam2536
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