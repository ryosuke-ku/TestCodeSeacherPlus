// clone pairs:14192:80%
// 17404:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/SubtasksTimesInfo.java

public class Nicad_t1_flink_new21475
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