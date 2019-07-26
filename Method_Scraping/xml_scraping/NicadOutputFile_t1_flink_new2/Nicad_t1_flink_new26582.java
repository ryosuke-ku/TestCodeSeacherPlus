// clone pairs:25884:90%
// 39648:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobConfigInfo.java

public class Nicad_t1_flink_new26582
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JobConfigInfo that = (JobConfigInfo) o;
		return Objects.equals(jobId, that.jobId) &&
			Objects.equals(jobName, that.jobName) &&
			Objects.equals(executionConfigInfo, that.executionConfigInfo);
	}
}