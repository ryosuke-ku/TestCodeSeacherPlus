// clone pairs:1015:78%
// 723:beam/runners/samza/src/main/java/org/apache/beam/runners/samza/runtime/SamzaStoreStateInternals.java

public class Nicad_t1_beam_new232
{
    protected ReadableState<Boolean> isEmptyInternal() {
      return new ReadableState<Boolean>() {
        @Override
        public Boolean read() {
          return store.get(getEncodedStoreKey()) == null;
        }

        @Override
        public ReadableState<Boolean> readLater() {
          return this;
        }
      };
    }
}