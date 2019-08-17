// clone pairs:9852:70%
// 15209:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/ApproximateQuantiles.java

public class Nicad_t1_beam3001
{
    public boolean equals(Object other) {
      if (other == this) {
        return true;
      }
      if (!(other instanceof QuantileStateCoder)) {
        return false;
      }
      QuantileStateCoder<?, ?> that = (QuantileStateCoder<?, ?>) other;
      return Objects.equals(this.elementCoder, that.elementCoder)
          && Objects.equals(this.compareFn, that.compareFn);
    }
}