// clone pairs:26710:80%
// 41273:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/DashboardConfiguration.java

public class Nicad_t1_flink_new27023
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DashboardConfiguration that = (DashboardConfiguration) o;
		return refreshInterval == that.refreshInterval &&
			timeZoneOffset == that.timeZoneOffset &&
			Objects.equals(timeZoneName, that.timeZoneName) &&
			Objects.equals(flinkVersion, that.flinkVersion) &&
			Objects.equals(flinkRevision, that.flinkRevision);
	}
}