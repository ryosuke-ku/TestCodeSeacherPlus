// clone pairs:13741:90%
// 16642:flink/flink-runtime/src/main/java/org/apache/flink/runtime/messages/webmonitor/JobIdsWithStatusOverview.java

public class Nicad_t2_flink873
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