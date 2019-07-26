// clone pairs:18324:80%
// 25339:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/SubtasksTimesInfo.java

public class Nicad_t1_flink_new23193
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}

			if (null == o || this.getClass() != o.getClass()) {
				return false;
			}

			SubtaskTimeInfo that = (SubtaskTimeInfo) o;
			return subtask == that.subtask &&
				Objects.equals(host, that.host) &&
				duration == that.duration &&
				Objects.equals(timestamps, that.timestamps);
		}
}