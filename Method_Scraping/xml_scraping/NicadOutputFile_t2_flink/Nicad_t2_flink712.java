// clone pairs:12596:80%
// 14901:flink/flink-runtime/src/main/java/org/apache/flink/runtime/messages/webmonitor/JobIdsWithStatusOverview.java

public class Nicad_t2_flink712
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