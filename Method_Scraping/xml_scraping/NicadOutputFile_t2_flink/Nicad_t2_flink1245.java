// clone pairs:21297:80%
// 31272:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/TaskExecutorLocalStateStoresManager.java

public class Nicad_t2_flink1245
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