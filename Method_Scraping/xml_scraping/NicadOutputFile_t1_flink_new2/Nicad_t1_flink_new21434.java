// clone pairs:14052:80%
// 17131:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/job/JobDetailsInfo.java

public class Nicad_t1_flink_new21434
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JobDetailsInfo that = (JobDetailsInfo) o;
		return isStoppable == that.isStoppable &&
			startTime == that.startTime &&
			endTime == that.endTime &&
			duration == that.duration &&
			now == that.now &&
			Objects.equals(jobId, that.jobId) &&
			Objects.equals(name, that.name) &&
			jobStatus == that.jobStatus &&
			Objects.equals(timestamps, that.timestamps) &&
			Objects.equals(jobVertexInfos, that.jobVertexInfos) &&
			Objects.equals(jobVerticesPerState, that.jobVerticesPerState) &&
			Objects.equals(jsonPlan, that.jsonPlan);
	}
}