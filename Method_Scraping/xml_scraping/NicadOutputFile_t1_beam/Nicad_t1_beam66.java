// clone pairs:1305:92%
// 1154:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkStateInternals.java

public class Nicad_t1_beam66
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      FlinkWatermarkHoldState<?, ?> that = (FlinkWatermarkHoldState<?, ?>) o;

      if (!timestampCombiner.equals(that.timestampCombiner)) {
        return false;
      }
      return namespaceString.equals(that.namespaceString);
    }
}