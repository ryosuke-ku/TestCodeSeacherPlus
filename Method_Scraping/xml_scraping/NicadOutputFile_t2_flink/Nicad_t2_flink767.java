// clone pairs:13507:90%
// 16180:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/TaskExecutorLocalStateStoresManager.java

public class Nicad_t2_flink767
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