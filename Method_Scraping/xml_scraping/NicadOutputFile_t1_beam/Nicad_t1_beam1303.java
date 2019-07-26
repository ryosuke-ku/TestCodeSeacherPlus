// clone pairs:4782:80%
// 6740:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkBroadcastStateInternals.java

public class Nicad_t1_beam1303
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      FlinkCombiningState<?, ?, ?> that = (FlinkCombiningState<?, ?, ?>) o;

      return namespace.equals(that.namespace) && address.equals(that.address);
    }
}