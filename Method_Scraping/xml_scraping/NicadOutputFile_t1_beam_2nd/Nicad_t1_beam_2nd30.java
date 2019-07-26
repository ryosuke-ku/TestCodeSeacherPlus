// clone pairs:649:70%
// 473:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkStateInternals.java

public class Nicad_t1_beam_2nd30
{
    public ReadableState<Boolean> isEmpty() {
      return new ReadableState<Boolean>() {
        @Override
        public Boolean read() {
          try {
            return watermarkHoldsState.get(namespaceString) == null;
          } catch (Exception e) {
            throw new RuntimeException("Error reading state.", e);
          }
        }

        @Override
        public ReadableState<Boolean> readLater() {
          return this;
        }
      };
    }
}