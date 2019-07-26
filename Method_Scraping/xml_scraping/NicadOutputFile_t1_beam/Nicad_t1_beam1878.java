// clone pairs:6259:80%
// 9278:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkStateInternals.java

public class Nicad_t1_beam1878
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      FlinkValueState<?> that = (FlinkValueState<?>) o;

      return namespace.equals(that.namespace) && stateId.equals(that.stateId);
    }
}