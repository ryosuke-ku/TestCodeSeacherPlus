// clone pairs:3891:80%
// 4713:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkBroadcastStateInternals.java

public class Nicad_t1_beam_2nd673
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      FlinkBroadcastValueState<?> that = (FlinkBroadcastValueState<?>) o;

      return namespace.equals(that.namespace) && address.equals(that.address);
    }
}