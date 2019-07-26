// clone pairs:6702:70%
// 8967:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/Top.java

public class Nicad_t1_beam_2nd1397
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