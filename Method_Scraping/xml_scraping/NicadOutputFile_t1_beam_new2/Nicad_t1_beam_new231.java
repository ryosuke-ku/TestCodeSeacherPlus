// clone pairs:1014:85%
// 721:beam/runners/samza/src/main/java/org/apache/beam/runners/samza/runtime/SamzaStoreStateInternals.java

public class Nicad_t1_beam_new231
{
    public ReadableState<Boolean> isEmpty() {
      return new ReadableState<Boolean>() {

        @Override
        public Boolean read() {
          return Iterables.isEmpty(mapState.entries().read());
        }

        @Override
        public ReadableState<Boolean> readLater() {
          return this;
        }
      };
    }
}