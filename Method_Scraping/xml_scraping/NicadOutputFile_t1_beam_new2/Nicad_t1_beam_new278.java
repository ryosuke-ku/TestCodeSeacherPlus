// clone pairs:1523:75%
// 1311:beam/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/pubsub/PubsubUnboundedSink.java

public class Nicad_t1_beam_new278
{
  public void PubsubUnboundedSink(
      PubsubClientFactory pubsubFactory,
      ValueProvider<TopicPath> topic,
      String timestampAttribute,
      String idAttribute,
      int numShards,
      int publishBatchSize,
      int publishBatchBytes,
      Duration maxLatency,
      RecordIdMethod recordIdMethod) {
    this.pubsubFactory = pubsubFactory;
    this.topic = topic;
    this.timestampAttribute = timestampAttribute;
    this.idAttribute = idAttribute;
    this.numShards = numShards;
    this.publishBatchSize = publishBatchSize;
    this.publishBatchBytes = publishBatchBytes;
    this.maxLatency = maxLatency;
    this.recordIdMethod = idAttribute == null ? RecordIdMethod.NONE : recordIdMethod;
  }
}