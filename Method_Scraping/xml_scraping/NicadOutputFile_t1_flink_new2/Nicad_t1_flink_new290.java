// clone pairs:6425:81%
// 6530:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/functions/sink/TwoPhaseCommitSinkFunction.java

public class Nicad_t1_flink_new290
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