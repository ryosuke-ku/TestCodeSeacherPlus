// clone pairs:15079:80%
// 21253:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/join/CoGbkResult.java

public class Nicad_t1_beam3724
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