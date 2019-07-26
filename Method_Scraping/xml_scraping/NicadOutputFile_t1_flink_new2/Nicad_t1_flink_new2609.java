// clone pairs:11200:90%
// 12488:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/TaskExecutorLocalStateStoresManager.java

public class Nicad_t1_flink_new2609
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}

			JobVertexSubtaskKey that = (JobVertexSubtaskKey) o;

			return subtaskIndex == that.subtaskIndex && jobVertexID.equals(that.jobVertexID);
		}
}