// clone pairs:1306:76%
// 1040:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkStateInternals.java

public class Nicad_t1_beam_new259
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