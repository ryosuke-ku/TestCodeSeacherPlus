// clone pairs:27388:90%
// 42599:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointingStatistics.java

public class Nicad_t1_flink_new27353
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			Counts counts = (Counts) o;
			return numberRestoredCheckpoints == counts.numberRestoredCheckpoints &&
				totalNumberCheckpoints == counts.totalNumberCheckpoints &&
				numberInProgressCheckpoints == counts.numberInProgressCheckpoints &&
				numberCompletedCheckpoints == counts.numberCompletedCheckpoints &&
				numberFailedCheckpoints == counts.numberFailedCheckpoints;
		}
}