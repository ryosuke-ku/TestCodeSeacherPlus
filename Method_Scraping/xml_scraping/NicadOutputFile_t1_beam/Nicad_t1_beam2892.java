// clone pairs:9475:90%
// 14601:beam/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/pubsub/PubsubClient.java

public class Nicad_t1_beam2892
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      SubscriptionPath that = (SubscriptionPath) o;
      return this.subscriptionName.equals(that.subscriptionName)
          && this.projectId.equals(that.projectId);
    }
}