// clone pairs:15386:80%
// 19741:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointingStatistics.java

public class Nicad_t1_flink_new21970
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