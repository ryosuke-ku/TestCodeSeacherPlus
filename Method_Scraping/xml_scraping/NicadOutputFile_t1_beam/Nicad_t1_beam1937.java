// clone pairs:6481:80%
// 9656:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkStateInternals.java

public class Nicad_t1_beam1937
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      FlinkSetState<?> that = (FlinkSetState<?>) o;

      return namespace.equals(that.namespace) && stateId.equals(that.stateId);
    }
}