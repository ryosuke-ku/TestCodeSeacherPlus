// clone pairs:24695:90%
// 37301:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointingStatistics.java

public class Nicad_t1_flink_new26054
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