// clone pairs:15998:90%
// 21071:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/DashboardConfiguration.java

public class Nicad_t2_flink923
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