// clone pairs:646:70%
// 487:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/state/FlinkStateInternals.java

public class Nicad_t1_beam29
{
    public ReadableState<Boolean> isEmpty() {
      return new ReadableState<Boolean>() {
        @Override
        public Boolean read() {
          try {
            return flinkStateBackend
                    .getPartitionedState(
                        namespace.stringKey(), StringSerializer.INSTANCE, flinkStateDescriptor)
                    .value()
                == null;
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