// clone pairs:4749:90%
// 6675:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/join/CoGbkResult.java

public class Nicad_t1_beam1287
{
    public boolean equals(Object object) {
      if (this == object) {
        return true;
      }
      if (!(object instanceof CoGbkResultCoder)) {
        return false;
      }
      CoGbkResultCoder other = (CoGbkResultCoder) object;
      return schema.equals(other.schema) && unionCoder.equals(other.unionCoder);
    }
}