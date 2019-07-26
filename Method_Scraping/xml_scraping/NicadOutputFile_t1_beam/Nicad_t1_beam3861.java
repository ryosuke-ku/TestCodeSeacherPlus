// clone pairs:15366:70%
// 21816:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/testing/PAssert.java

public class Nicad_t1_beam3861
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