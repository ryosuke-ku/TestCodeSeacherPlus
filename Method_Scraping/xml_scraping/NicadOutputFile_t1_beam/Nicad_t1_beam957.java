// clone pairs:3898:80%
// 5217:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkBroadcastStateInternals.java

public class Nicad_t1_beam957
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