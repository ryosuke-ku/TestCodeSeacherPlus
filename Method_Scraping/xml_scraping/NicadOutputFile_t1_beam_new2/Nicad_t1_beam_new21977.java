// clone pairs:9323:90%
// 12713:beam/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/pubsub/PubsubClient.java

public class Nicad_t1_beam_new21977
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      OutgoingMessage that = (OutgoingMessage) o;

      return timestampMsSinceEpoch == that.timestampMsSinceEpoch
          && Arrays.equals(elementBytes, that.elementBytes)
          && Objects.equal(attributes, that.attributes)
          && Objects.equal(recordId, that.recordId);
    }
}