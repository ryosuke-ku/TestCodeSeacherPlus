// clone pairs:5226:70%
// 7507:beam/runners/core-java/src/main/java/org/apache/beam/runners/core/StateNamespaces.java

public class Nicad_t1_beam1485
{
    public boolean equals(Object obj) {
      if (obj == this) {
        return true;
      }

      if (!(obj instanceof WindowNamespace)) {
        return false;
      }

      WindowNamespace<?> that = (WindowNamespace<?>) obj;
      return Objects.equals(this.windowStructuralValue(), that.windowStructuralValue());
    }
}