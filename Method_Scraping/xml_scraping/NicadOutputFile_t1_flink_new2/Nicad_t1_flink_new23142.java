// clone pairs:18196:80%
// 25089:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobExceptionsInfo.java

public class Nicad_t1_flink_new23142
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			JobExceptionsInfo.ExecutionExceptionInfo that = (JobExceptionsInfo.ExecutionExceptionInfo) o;
			return timestamp == that.timestamp &&
				Objects.equals(exception, that.exception) &&
				Objects.equals(task, that.task) &&
				Objects.equals(location, that.location);
		}
}