// clone pairs:8224:80%
// 12582:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkStateInternals.java

public class Nicad_t1_beam2443
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