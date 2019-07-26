// clone pairs:12011:80%
// 14034:flink/flink-runtime/src/main/java/org/apache/flink/runtime/messages/webmonitor/JobDetails.java

public class Nicad_t1_flink_new2941
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		else if (o != null && o.getClass() == JobDetails.class) {
			JobDetails that = (JobDetails) o;

			return this.endTime == that.endTime &&
					this.lastUpdateTime == that.lastUpdateTime &&
					this.numTasks == that.numTasks &&
					this.startTime == that.startTime &&
					this.status == that.status &&
					this.jobId.equals(that.jobId) &&
					this.jobName.equals(that.jobName) &&
					Arrays.equals(this.tasksPerState, that.tasksPerState);
		}
		else {
			return false;
		}
	}
}