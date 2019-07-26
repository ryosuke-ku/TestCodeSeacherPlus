// clone pairs:793:100%
// 314:kafka/clients/src/main/java/org/apache/kafka/clients/consumer/internals/Fetcher.java

public class Nicad_t2_kafka_96_1006
{
        private void recordPartitionLead(TopicPartition tp, long lead) {
            this.recordsFetchLead.record(lead);

            String name = partitionLeadMetricName(tp);
            Sensor recordsLead = this.metrics.getSensor(name);
            if (recordsLead == null) {
                Map<String, String> metricTags = new HashMap<>(2);
                metricTags.put("topic", tp.topic().replace('.', '_'));
                metricTags.put("partition", String.valueOf(tp.partition()));

                recordsLead = this.metrics.sensor(name);

                recordsLead.add(this.metrics.metricInstance(metricsRegistry.partitionRecordsLead, metricTags), new Value());
                recordsLead.add(this.metrics.metricInstance(metricsRegistry.partitionRecordsLeadMin, metricTags), new Min());
                recordsLead.add(this.metrics.metricInstance(metricsRegistry.partitionRecordsLeadAvg, metricTags), new Avg());
            }
            recordsLead.record(lead);
        }
}