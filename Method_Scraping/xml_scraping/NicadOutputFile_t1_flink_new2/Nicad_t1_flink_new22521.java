// clone pairs:16622:90%
// 22157:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointingStatistics.java

public class Nicad_t1_flink_new22521
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			Summary summary = (Summary) o;
			return Objects.equals(stateSize, summary.stateSize) &&
				Objects.equals(duration, summary.duration) &&
				Objects.equals(alignmentBuffered, summary.alignmentBuffered);
		}
}