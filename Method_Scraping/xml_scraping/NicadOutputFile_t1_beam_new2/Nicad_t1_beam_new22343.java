// clone pairs:15383:80%
// 17124:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/testing/PAssert.java

public class Nicad_t1_beam_new22343
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      PAssertionSite that = (PAssertionSite) o;
      return Objects.equal(message, that.message)
          && Arrays.equals(creationStackTrace, that.creationStackTrace);
    }
}