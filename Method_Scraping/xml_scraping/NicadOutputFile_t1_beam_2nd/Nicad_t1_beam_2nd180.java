// clone pairs:2006:72%
// 1858:beam/runners/samza/src/main/java/org/apache/beam/runners/samza/runtime/SamzaStoreStateInternals.java

public class Nicad_t1_beam_2nd180
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