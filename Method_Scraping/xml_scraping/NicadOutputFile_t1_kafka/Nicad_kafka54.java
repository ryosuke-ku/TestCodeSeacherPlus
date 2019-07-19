// clone pairs:1322:80%
// 666:kafka/clients/src/main/java/org/apache/kafka/common/record/DefaultRecord.java

public class Nicad_kafka54
{
    private DefaultRecord(int sizeInBytes,
                          byte attributes,
                          long offset,
                          long timestamp,
                          int sequence,
                          ByteBuffer key,
                          ByteBuffer value,
                          Header[] headers) {
        this.sizeInBytes = sizeInBytes;
        this.attributes = attributes;
        this.offset = offset;
        this.timestamp = timestamp;
        this.sequence = sequence;
        this.key = key;
        this.value = value;
        this.headers = headers;
    }
}