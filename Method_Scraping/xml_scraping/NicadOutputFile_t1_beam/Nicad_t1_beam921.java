// clone pairs:3752:90%
// 4988:beam/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/pubsub/PubsubClient.java

public class Nicad_t1_beam921
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