// clone pairs:5503:80%
// 7980:beam/runners/core-java/src/main/java/org/apache/beam/runners/core/metrics/MonitoringInfoMetricName.java

public class Nicad_t1_beam1608
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