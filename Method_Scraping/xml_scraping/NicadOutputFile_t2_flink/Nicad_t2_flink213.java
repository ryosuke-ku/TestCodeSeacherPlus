// clone pairs:6705:73%
// 6781:flink/flink-runtime/src/main/java/org/apache/flink/runtime/executiongraph/failover/FailoverRegion.java

public class Nicad_t2_flink213
{
	private void allVerticesInTerminalState(long globalModVersionOfFailover) {
		while (true) {
			JobStatus curStatus = this.state;
			if (curStatus.equals(JobStatus.CANCELLING)) {
				if (transitionState(curStatus, JobStatus.CANCELED)) {
					reset(globalModVersionOfFailover);
					break;
				}
			}
			else {
				LOG.info("FailoverRegion {} is {} when allVerticesInTerminalState.", id, state);
				break;
			}
		}
	}
}