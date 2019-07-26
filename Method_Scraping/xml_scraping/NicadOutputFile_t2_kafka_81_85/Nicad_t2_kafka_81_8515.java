// clone pairs:990:83%
// 428:kafka/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/ConnectMetrics.java

public class Nicad_t2_kafka_81_8515
{
        public <T> void addValueMetric(MetricNameTemplate nameTemplate, final LiteralSupplier<T> supplier) {
            MetricName metricName = metricName(nameTemplate);
            if (metrics().metric(metricName) == null) {
                metrics().addMetric(metricName, new Gauge<T>() {
                    @Override
                    public T value(MetricConfig config, long now) {
                        return supplier.metricValue(now);
                    }
                });
            }
        }
}