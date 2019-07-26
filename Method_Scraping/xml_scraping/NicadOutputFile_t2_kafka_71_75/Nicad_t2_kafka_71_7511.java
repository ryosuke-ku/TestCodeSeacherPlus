// clone pairs:565:72%
// 207:kafka/clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerRecord.java

public class Nicad_t2_kafka_71_7511
{
    public ConsumerRecord(String topic,
                          int partition,
                          long offset,
                          long timestamp,
                          TimestampType timestampType,
                          Long checksum,
                          int serializedKeySize,
                          int serializedValueSize,
                          K key,
                          V value,
                          Headers headers,
                          Optional<Integer> leaderEpoch) {
        if (topic == null)
            throw new IllegalArgumentException("Topic cannot be null");
        if (headers == null)
            throw new IllegalArgumentException("Headers cannot be null");

        this.topic = topic;
        this.partition = partition;
        this.offset = offset;
        this.timestamp = timestamp;
        this.timestampType = timestampType;
        this.checksum = checksum;
        this.serializedKeySize = serializedKeySize;
        this.serializedValueSize = serializedValueSize;
        this.key = key;
        this.value = value;
        this.headers = headers;
        this.leaderEpoch = leaderEpoch;
    }
}