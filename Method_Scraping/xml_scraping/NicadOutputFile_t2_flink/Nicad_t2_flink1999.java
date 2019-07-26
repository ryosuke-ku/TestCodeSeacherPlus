// clone pairs:25249:80%
// 38695:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointingStatistics.java

public class Nicad_t2_flink1999
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