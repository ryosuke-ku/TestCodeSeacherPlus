// clone pairs:1186:76%
// 902:beam/runners/core-java/src/main/java/org/apache/beam/runners/core/InMemoryStateInternals.java

public class Nicad_t1_beam_new238
{
    public ReadableState<Boolean> isEmpty() {
      return new ReadableState<Boolean>() {
        @Override
        public ReadableState<Boolean> readLater() {
          return this;
        }

        @Override
        public Boolean read() {
          return isCleared;
        }
      };
    }
}