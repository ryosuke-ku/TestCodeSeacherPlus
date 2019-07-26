// clone pairs:1014:85%
// 815:beam/runners/samza/src/main/java/org/apache/beam/runners/samza/runtime/SamzaStoreStateInternals.java

public class Nicad_t1_beam41
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