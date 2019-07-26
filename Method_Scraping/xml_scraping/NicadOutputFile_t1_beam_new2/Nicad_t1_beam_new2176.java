// clone pairs:2062:72%
// 1919:beam/runners/samza/src/main/java/org/apache/beam/runners/samza/runtime/SamzaStoreStateInternals.java

public class Nicad_t1_beam_new2176
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      @SuppressWarnings("unchecked")
      final AbstractSamzaState<?> that = (AbstractSamzaState<?>) o;
      return Arrays.equals(encodedStoreKey, that.encodedStoreKey);
    }
}