// clone pairs:5099:70%
// 7293:beam/runners/core-java/src/main/java/org/apache/beam/runners/core/StateNamespaces.java

public class Nicad_t1_beam1424
{
    public boolean equals(Object obj) {
      if (obj == this) {
        return true;
      }

      if (!(obj instanceof WindowAndTriggerNamespace)) {
        return false;
      }

      WindowAndTriggerNamespace<?> that = (WindowAndTriggerNamespace<?>) obj;
      return this.triggerIndex == that.triggerIndex
          && Objects.equals(this.windowStructuralValue(), that.windowStructuralValue());
    }
}