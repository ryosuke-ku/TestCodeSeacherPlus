// clone pairs:26512:90%
// 41183:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/job/JobSubmitRequestBody.java

public class Nicad_t2_flink2535
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