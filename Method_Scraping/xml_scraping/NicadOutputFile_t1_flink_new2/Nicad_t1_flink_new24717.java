// clone pairs:21680:90%
// 31732:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/job/JobSubmitRequestBody.java

public class Nicad_t1_flink_new24717
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JobSubmitRequestBody that = (JobSubmitRequestBody) o;
		return Objects.equals(jobGraphFileName, that.jobGraphFileName) &&
			Objects.equals(jarFileNames, that.jarFileNames) &&
			Objects.equals(artifactFileNames, that.artifactFileNames);
	}
}