// clone pairs:18487:90%
// 25658:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/job/JobDetailsInfo.java

public class Nicad_t1_flink_new23278
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			JobVertexDetailsInfo that = (JobVertexDetailsInfo) o;
			return parallelism == that.parallelism &&
				startTime == that.startTime &&
				endTime == that.endTime &&
				duration == that.duration &&
				Objects.equals(jobVertexID, that.jobVertexID) &&
				Objects.equals(name, that.name) &&
				executionState == that.executionState &&
				Objects.equals(tasksPerState, that.tasksPerState) &&
				Objects.equals(jobVertexMetrics, that.jobVertexMetrics);
		}
}