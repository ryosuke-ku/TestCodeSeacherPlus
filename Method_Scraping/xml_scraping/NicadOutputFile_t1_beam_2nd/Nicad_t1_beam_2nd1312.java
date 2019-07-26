// clone pairs:6332:80%
// 8431:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkStateInternals.java

public class Nicad_t1_beam_2nd1312
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      FlinkBagState<?, ?> that = (FlinkBagState<?, ?>) o;

      return namespace.equals(that.namespace) && stateId.equals(that.stateId);
    }
}