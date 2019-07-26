// clone pairs:1019:83%
// 468:kafka/clients/src/main/java/org/apache/kafka/clients/producer/internals/ProducerInterceptors.java

public class Nicad_t2_kafka_81_8521
{
    public ProducerRecord<K, V> onSend(ProducerRecord<K, V> record) {
        ProducerRecord<K, V> interceptRecord = record;
        for (ProducerInterceptor<K, V> interceptor : this.interceptors) {
            try {
                interceptRecord = interceptor.onSend(interceptRecord);
            } catch (Exception e) {
                // do not propagate interceptor exception, log and continue calling other interceptors
                // be careful not to throw exception from here
                if (record != null)
                    log.warn("Error executing interceptor onSend callback for topic: {}, partition: {}", record.topic(), record.partition(), e);
                else
                    log.warn("Error executing interceptor onSend callback", e);
            }
        }
        return interceptRecord;
    }
}