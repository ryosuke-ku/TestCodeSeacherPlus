// clone pairs:6429:80%
// 8557:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterProcessingTime.java

public class Nicad_t1_beam_2nd1328
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