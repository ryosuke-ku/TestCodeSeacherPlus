// clone pairs:14407:90%
// 17826:flink/flink-runtime/src/main/java/org/apache/flink/runtime/messages/webmonitor/JobIdsWithStatusOverview.java

public class Nicad_t1_flink_new21578
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			JobIdWithStatus that = (JobIdWithStatus) o;
			return Objects.equals(jobId, that.jobId) &&
				jobStatus == that.jobStatus;
		}
}