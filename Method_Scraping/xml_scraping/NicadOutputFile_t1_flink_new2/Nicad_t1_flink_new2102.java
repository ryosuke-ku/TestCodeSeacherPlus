// clone pairs:6675:75%
// 6726:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/functions/sink/TwoPhaseCommitSinkFunction.java

public class Nicad_t1_flink_new2102
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}

			State<?, ?> state = (State<?, ?>) o;

			if (pendingTransaction != null ? !pendingTransaction.equals(state.pendingTransaction) : state.pendingTransaction != null) {
				return false;
			}
			if (pendingCommitTransactions != null ? !pendingCommitTransactions.equals(state.pendingCommitTransactions) : state.pendingCommitTransactions != null) {
				return false;
			}
			return context != null ? context.equals(state.context) : state.context == null;
		}
}