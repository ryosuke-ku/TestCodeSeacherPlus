// clone pairs:2623:90%
// 2780:beam/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/pubsub/PubsubClient.java

public class Nicad_t1_beam_2nd335
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      IncomingMessage that = (IncomingMessage) o;

      return timestampMsSinceEpoch == that.timestampMsSinceEpoch
          && requestTimeMsSinceEpoch == that.requestTimeMsSinceEpoch
          && ackId.equals(that.ackId)
          && recordId.equals(that.recordId)
          && Arrays.equals(elementBytes, that.elementBytes)
          && Objects.equal(attributes, that.attributes);
    }
}