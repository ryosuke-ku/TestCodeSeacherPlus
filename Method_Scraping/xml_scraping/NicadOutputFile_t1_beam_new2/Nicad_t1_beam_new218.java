// clone pairs:643:70%
// 462:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkBroadcastStateInternals.java

public class Nicad_t1_beam_new218
{
    public ReadableState<Boolean> isEmpty() {
      return new ReadableState<Boolean>() {
        @Override
        public Boolean read() {
          try {
            return readInternal() == null;
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