// clone pairs:7697:78%
// 7610:flink/flink-runtime/src/main/java/org/apache/flink/runtime/jobmaster/JobManagerRunner.java

public class Nicad_t2_flink287
{
	public void grantLeadership(final UUID leaderSessionID) {
		synchronized (lock) {
			if (shutdown) {
				log.info("JobManagerRunner already shutdown.");
				return;
			}

			leadershipOperation = leadershipOperation.thenCompose(
				(ignored) -> {
					synchronized (lock) {
						return verifyJobSchedulingStatusAndStartJobManager(leaderSessionID);
					}
				});

			handleException(leadershipOperation, "Could not start the job manager.");
		}
	}
}