// clone pairs:850:76%
// 367:kafka/clients/src/main/java/org/apache/kafka/common/metrics/stats/Frequencies.java

public class Nicad_kafka29
{
    public List<NamedMeasurable> stats() {
        List<NamedMeasurable> ms = new ArrayList<>(frequencies.length);
        for (Frequency frequency : frequencies) {
            final double center = frequency.centerValue();
            ms.add(new NamedMeasurable(frequency.name(), new Measurable() {
                public double measure(MetricConfig config, long now) {
                    return frequency(config, now, center);
                }
            }));
        }
        return ms;
    }
}