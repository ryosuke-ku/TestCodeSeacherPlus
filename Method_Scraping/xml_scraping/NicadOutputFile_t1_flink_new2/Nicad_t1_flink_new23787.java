// clone pairs:19576:90%
// 27788:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointConfigInfo.java

public class Nicad_t1_flink_new23787
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