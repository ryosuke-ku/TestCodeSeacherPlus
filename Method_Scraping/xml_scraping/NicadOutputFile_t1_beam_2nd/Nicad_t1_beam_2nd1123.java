// clone pairs:5603:90%
// 7313:beam/runners/core-java/src/main/java/org/apache/beam/runners/core/metrics/MonitoringInfoMetricName.java

public class Nicad_t1_beam_2nd1123
{
  public boolean equals(Object o) {
    // If the object is compared with itself then return true
    if (o == this) {
      return true;
    }
    if (!(o instanceof MonitoringInfoMetricName)) {
      return false;
    }
    MonitoringInfoMetricName other = (MonitoringInfoMetricName) o;
    return this.urn.equals(other.urn) && this.labels.equals(other.labels);
  }
}