// clone pairs:12042:70%
// 17410:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/Top.java

public class Nicad_t1_beam3220
{
    public boolean equals(Object other) {
      if (other == this) {
        return true;
      }
      if (!(other instanceof BoundedHeapCoder)) {
        return false;
      }
      BoundedHeapCoder<?, ?> that = (BoundedHeapCoder<?, ?>) other;
      return Objects.equals(this.compareFn, that.compareFn)
          && Objects.equals(this.listCoder, that.listCoder)
          && this.maximumSize == that.maximumSize;
    }
}