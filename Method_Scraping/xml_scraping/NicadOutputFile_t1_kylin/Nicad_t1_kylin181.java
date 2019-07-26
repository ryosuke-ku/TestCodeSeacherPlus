// clone pairs:1164:100%
// 1890:kylin/core-metadata/src/main/java/org/apache/kylin/measure/percentile/PercentileAggregator.java

public class Nicad_t1_kylin181
{
    public PercentileCounter aggregate(PercentileCounter value1, PercentileCounter value2) {
        if (value1 == null) {
            return new PercentileCounter(value2);
        } else if (value2 == null) {
            return new PercentileCounter(value1);
        }
        PercentileCounter merged = new PercentileCounter(value1);
        merged.merge(value2);
        return merged;
    }
}