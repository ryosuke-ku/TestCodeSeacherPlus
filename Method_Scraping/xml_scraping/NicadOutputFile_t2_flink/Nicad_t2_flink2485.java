// clone pairs:26335:90%
// 40835:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointConfigInfo.java

public class Nicad_t2_flink2485
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			ExternalizedCheckpointInfo that = (ExternalizedCheckpointInfo) o;
			return enabled == that.enabled &&
				deleteOnCancellation == that.deleteOnCancellation;
		}
}