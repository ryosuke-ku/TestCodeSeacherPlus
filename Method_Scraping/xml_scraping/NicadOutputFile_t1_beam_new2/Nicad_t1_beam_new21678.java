// clone pairs:7843:80%
// 10638:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterProcessingTime.java

public class Nicad_t1_beam_new21678
{
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof AfterProcessingTime)) {
      return false;
    }

    AfterProcessingTime that = (AfterProcessingTime) obj;
    return getTimestampTransforms().equals(that.getTimestampTransforms());
  }
}