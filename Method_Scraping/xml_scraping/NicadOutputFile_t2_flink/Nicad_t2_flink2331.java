// clone pairs:25933:90%
// 40043:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/job/SubtasksAllAccumulatorsInfo.java

public class Nicad_t2_flink2331
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			SubtaskAccumulatorsInfo that = (SubtaskAccumulatorsInfo) o;
			return subtaskIndex == that.subtaskIndex &&
				attemptNum == that.attemptNum &&
				Objects.equals(host, that.host) &&
				Objects.equals(userAccumulators, that.userAccumulators);
		}
}