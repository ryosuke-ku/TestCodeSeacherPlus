// clone pairs:22133:80%
// 32905:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/DashboardConfiguration.java

public class Nicad_t2_flink1437
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