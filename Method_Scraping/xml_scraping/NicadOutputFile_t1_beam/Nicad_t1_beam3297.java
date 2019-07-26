// clone pairs:12370:80%
// 17959:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/join/CoGbkResult.java

public class Nicad_t1_beam3297
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