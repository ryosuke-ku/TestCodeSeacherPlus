// clone pairs:12863:70%
// 15209:flink/flink-runtime/src/main/java/org/apache/flink/runtime/messages/webmonitor/JobIdsWithStatusOverview.java

public class Nicad_t2_flink721
{
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		else if (obj instanceof JobIdsWithStatusOverview) {
			JobIdsWithStatusOverview that = (JobIdsWithStatusOverview) obj;
			return jobsWithStatus.equals(that.getJobsWithStatus());
		}
		else {
			return false;
		}
	}
}