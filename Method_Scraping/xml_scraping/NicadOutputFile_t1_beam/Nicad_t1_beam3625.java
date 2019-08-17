// clone pairs:13583:90%
// 19925:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/testing/PAssert.java

public class Nicad_t1_beam3625
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