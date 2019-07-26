// clone pairs:1866:72%
// 1693:beam/sdks/java/io/kinesis/src/main/java/org/apache/beam/sdk/io/kinesis/KinesisRecordCoder.java

public class Nicad_t1_beam_new2141
{
  public KinesisRecord decode(InputStream inStream) throws IOException {
    ByteBuffer data = ByteBuffer.wrap(BYTE_ARRAY_CODER.decode(inStream));
    String sequenceNumber = STRING_CODER.decode(inStream);
    String partitionKey = STRING_CODER.decode(inStream);
    Instant approximateArrivalTimestamp = INSTANT_CODER.decode(inStream);
    long subSequenceNumber = VAR_LONG_CODER.decode(inStream);
    Instant readTimestamp = INSTANT_CODER.decode(inStream);
    String streamName = STRING_CODER.decode(inStream);
    String shardId = STRING_CODER.decode(inStream);
    return new KinesisRecord(
        data,
        sequenceNumber,
        subSequenceNumber,
        partitionKey,
        approximateArrivalTimestamp,
        readTimestamp,
        streamName,
        shardId);
  }
}