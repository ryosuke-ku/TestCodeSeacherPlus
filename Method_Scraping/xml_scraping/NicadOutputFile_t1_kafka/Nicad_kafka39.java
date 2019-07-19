// clone pairs:1036:75%
// 502:kafka/clients/src/main/java/org/apache/kafka/common/record/DefaultRecord.java

public class Nicad_kafka39
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