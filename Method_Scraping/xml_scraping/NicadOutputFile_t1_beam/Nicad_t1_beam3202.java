// clone pairs:11960:80%
// 17274:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/join/CoGbkResult.java

public class Nicad_t1_beam3202
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