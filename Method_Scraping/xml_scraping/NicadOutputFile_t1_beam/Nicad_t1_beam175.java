// clone pairs:1854:90%
// 1845:beam/sdks/java/extensions/sql/src/main/java/org/apache/beam/sdk/extensions/sql/impl/transform/agg/VarianceAccumulator.java

public class Nicad_t1_beam175
{
  VarianceAccumulator combineWith(VarianceAccumulator otherVariance) {
    if (EMPTY.equals(this)) {
      return otherVariance;
    }

    if (EMPTY.equals(otherVariance)) {
      return this;
    }

    BigDecimal increment = calculateIncrement(this, otherVariance);
    BigDecimal combinedVariance = this.variance().add(otherVariance.variance()).add(increment);

    return newVarianceAccumulator(
        combinedVariance,
        this.count().add(otherVariance.count()),
        this.sum().add(otherVariance.sum()));
  }
}